#language: pt
Funcionalidade: Cadastro de novas contas

  Cenario: Cadastro de conta v�lida
    Dado que estou na tela de cadastro
    Quando eu preencho todos os campos obrigatorios
    Entao deve retornar para a pagina inicial logado na conta criada
#
  #Cenario: Cadastro de conta inv�lida
    #Dado que estou com o aplicativo aberto
    #Quando eu preencho todos os campos obrigatorios, exceto o email
    #Entao o bot�o de registrar deve estar indisponivel para cliques
