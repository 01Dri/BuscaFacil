package me.dri.buscarcep.services;



import me.dri.buscarcep.exception.JsonFormatException;
import me.dri.buscarcep.model.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;



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
