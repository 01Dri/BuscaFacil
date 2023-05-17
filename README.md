# API PARA CONSULTAR CEPs BRASILEROS. 🇧🇷
Ao fazer uma consulta GET no endpoint /buscarcep/{cep} é retornado em formato JSON as informações do CEP.

# BASE DE DADOS 🎲
Todas as informações da entidade "Address" é persistida no banco de dados MONGODB (NOSQL)

# LOGICA APLICADA 💡 
O codigo fornece acesso ao banco de dados recuperando os CEPs disponiveis, caso o CEP informado pelo usuario
não esteja no banco de dados, é chamado o metodo "getViaCepAddress", sua função é consumir a API "https://viacep.com.br/"
no seu endpoint " viacep.com.br/ws/cep/json/" após isso é salvo em memoria o objeto retornado em JSON na entidade Address e exibida no endpoint atual "/buscarcep/{cep}" 
O objeto recuperado da API ViaCEP é persistido no banco de dados para uma futura requisição.


