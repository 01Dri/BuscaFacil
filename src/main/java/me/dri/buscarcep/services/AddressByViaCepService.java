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
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;



@Service
public class AddressByViaCepService {


    public Address getViaCepAddress(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<Address> addressResponseEntity = restTemplate.getForEntity(String.format("https://viacep.com.br/ws/%s/json/", cep), Address.class);
            return addressResponseEntity.getBody();
        }
        catch (HttpClientErrorException e) {
            throw new JsonFormatException("Formato informado pelo usuario é incorreto!");
        }
    }
}
