package me.dri.buscarcep.services;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import me.dri.buscarcep.exception.CepNullContent;
import me.dri.buscarcep.exception.JsonFormatException;
import me.dri.buscarcep.model.Address;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class AddressByViaCepService {

    public  Address getAddressByViaCep(String cep) throws ClientProtocolException, IOException, IllegalStateException {
        Address address = null;
        var request = new HttpGet("https://viacep.com.br/ws/"+cep+"/json/");
        try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
             CloseableHttpResponse respose = httpClient.execute(request)) {
            var entity = respose.getEntity();
            String result = EntityUtils.toString(entity);
            Gson gson = new Gson();
            try {
                address = gson.fromJson(result, Address.class);
            }
            catch (JsonSyntaxException e) {
                throw new JsonFormatException("O formato digitado pelo usuário não é permitido!");
            }
        }
        return address;
    }
}
