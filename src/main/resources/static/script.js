function buscarCep() {
    var inputCepValue = document.getElementById("inputCep");
    var valorCep = inputCepValue.value;
    
    fetch('/buscarcep/' + valorCep)
    .then(response => {
        if (response.ok) {
            return response.json();
        } else {
            throw new Error('Erro na requisição: ' + response.status);
        }
    })
    .then(cep => {

        var logradouroJson = document.getElementById("logradouro");
        logradouroJson.textContent = cep.logradouro;

        var bairroJson = document.getElementById("bairro");
        bairroJson.textContent = cep.bairro;

        var localidadeJson = document.getElementById("localidade");
        localidadeJson.textContent = cep.localidade;

        var cepJson = document.getElementById("cep");
        cepJson.textContent = cep.cep;

        var errorText = document.getElementById("errorText");
        errorText.textContent = "";

    })
    .catch(error => {

        var errorText = document.getElementById("errorText");
        errorText.textContent = "CEP inválido, por favor digite novamente.";

    });
}

