# API PARA CONSULTAR CEPs BRASILEROS. 🇧🇷
Ao fazer uma consulta 𝐆𝐄𝐓 no endpoint /buscarcep/{cep} é retornado em formato 𝐉𝐒𝐎𝐍 as informações do CEP.

# BASE DE DADOS 🎲
Todas as informações da entidade "Address" é persistida no banco de dados 𝐌𝐎𝐍𝐆𝐎𝐃𝐁 (𝐍𝐎𝐒𝐐𝐋)

# LOGICA APLICADA 💡 
O codigo fornece acesso ao banco de dados recuperando os CEPs disponiveis, caso o CEP informado pelo usuario
não esteja no banco de dados, é chamado o metodo "getViaCepAddress", sua função é consumir a 𝐀𝐏𝐈 "https://viacep.com.br/" no seu endpoint "viacep.com.br/ws/cep/json/" 
após isso é salvo em memoria o objeto retornado em 𝐉𝐒𝐎𝐍 na entidade Address e exibida no endpoint atual "/buscarcep/{cep}" 
O objeto recuperado da API ViaCEP é persistido no banco de dados para uma futura requisição.


