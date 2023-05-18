# API PARA CONSULTAR CEPs BRASILEROS. 🇧🇷
Ao fazer uma consulta 𝐆𝐄𝐓 no endpoint /buscarcep/{cep} é retornado em formato 𝐉𝐒𝐎𝐍 as informações do CEP.

# BASE DE DADOS 🎲
Todas as informações do objeto "Address" é persistida no banco de dados 𝐌𝐎𝐍𝐆𝐎𝐃𝐁 (𝐍𝐎𝐒𝐐𝐋)

# LOGICA APLICADA 💡 
O codigo fornece acesso ao banco de dados recuperando os CEPs disponiveis, caso o CEP informado pelo usuario
não esteja no banco de dados, é chamado o metodo "getViaCepAddress", 𝘀𝘂𝗮 𝗳𝘂𝗻𝗰̧𝗮̃𝗼 𝗲́ 𝗰𝗼𝗻𝘀𝘂𝗺𝗶𝗿 𝗮 𝐀𝐏𝐈 "𝗵𝘁𝘁𝗽𝘀://𝘃𝗶𝗮𝗰𝗲𝗽.𝗰𝗼𝗺.𝗯𝗿/" 𝗻𝗼 𝘀𝗲𝘂 𝗲𝗻𝗱𝗽𝗼𝗶𝗻𝘁 "𝘃𝗶𝗮𝗰𝗲𝗽.𝗰𝗼𝗺.𝗯𝗿/𝘄𝘀/𝗰𝗲𝗽/𝗷𝘀𝗼𝗻/",
após isso é salvo em memoria o objeto retornado em 𝐉𝐒𝐎𝐍 na entidade Address e exibida no endpoint atual "/buscarcep/{cep}" 
O objeto recuperado da API ViaCEP é persistido no banco de dados para uma futura requisição.

# ATUALIZAÇÕES: ⚙

Adicionei um front-end basico para o projeto, ao acessar o endpoint /buscar, é exibido um html com um campo input e um botão,
ao inserir o CEP uma requisição GET é enviada pelo arquivo JS "script.js" e retorna o objeto JSON para as divs especificas.


# TELA INICIAL (ENDPOINT /BUSCAR)
![image](https://github.com/01Dri/buscar-cep/assets/124473653/86adb7ea-92d5-4648-8ac6-45978da6f5f3)


# OBJETO RETORNANDO EM JSON TRATADO EM DIVS NO FRONT 
![image](https://github.com/01Dri/buscar-cep/assets/124473653/3b913c4a-859d-4d8f-a20d-7d8f6c3e89d0)

