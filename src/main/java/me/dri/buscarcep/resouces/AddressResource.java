package me.dri.buscarcep.resouces;


import me.dri.buscarcep.model.Address;
import me.dri.buscarcep.services.AddressByViaCepService;
import me.dri.buscarcep.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/buscarcep")
public class AddressResource {


    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressByViaCepService addressByViaCepService;


    @GetMapping(value = "/{cep}")

    public ResponseEntity<Address> findByCep(@PathVariable String cep) throws IOException {
        Address address = addressService.findByCep(cep);
            return ResponseEntity.ok().body(address);
    }
}
