# API PARA CONSULTAR CEPs BRASILEROS. 🇧🇷
Ao fazer uma consulta 𝐆𝐄𝐓 no endpoint /buscarcep/{cep} é retornado em formato 𝐉𝐒𝐎𝐍 as informações do CEP.

# BASE DE DADOS 🎲
Todas as informações da entidade "Address" é persistida no banco de dados 𝐌𝐎𝐍𝐆𝐎𝐃𝐁 (𝐍𝐎𝐒𝐐𝐋)

# LOGICA APLICADA 💡 
O codigo fornece acesso ao banco de dados recuperando os CEPs disponiveis, caso o CEP informado pelo usuario
não esteja no banco de dados, é chamado o metodo "getViaCepAddress", 𝘀𝘂𝗮 𝗳𝘂𝗻𝗰̧𝗮̃𝗼 𝗲́ 𝗰𝗼𝗻𝘀𝘂𝗺𝗶𝗿 𝗮 𝐀𝐏𝐈 "𝗵𝘁𝘁𝗽𝘀://𝘃𝗶𝗮𝗰𝗲𝗽.𝗰𝗼𝗺.𝗯𝗿/" 𝗻𝗼 𝘀𝗲𝘂 𝗲𝗻𝗱𝗽𝗼𝗶𝗻𝘁 "𝘃𝗶𝗮𝗰𝗲𝗽.𝗰𝗼𝗺.𝗯𝗿/𝘄𝘀/𝗰𝗲𝗽/𝗷𝘀𝗼𝗻/",
após isso é salvo em memoria o objeto retornado em 𝐉𝐒𝐎𝐍 na entidade Address e exibida no endpoint atual "/buscarcep/{cep}" 
O objeto recuperado da API ViaCEP é persistido no banco de dados para uma futura requisição.


