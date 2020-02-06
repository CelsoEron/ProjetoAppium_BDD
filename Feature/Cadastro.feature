#language: pt
Funcionalidade: Cadastro de novas contas

  Cenario: Cadastro de conta válida
    Dado que estou com o aplicativo aberto
    Quando eu preencho todos os campos obrigatorios
    E clico no botão de registrar
    Entao deve retornar para a pagina inicial logado na conta criada

  Cenario: Cadastro de conta inválida
    Dado que estou com o aplicativo aberto
    Quando eu preencho todos os campos obrigatorios, exceto o email
    Entao o botão de registrar deve estar indisponivel para cliques
