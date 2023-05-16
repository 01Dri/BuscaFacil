package me.dri.buscarcep.services;


import me.dri.buscarcep.exception.CepNullContent;
import me.dri.buscarcep.model.Address;
import me.dri.buscarcep.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressByViaCepService addressByViaCepService;

    public Address findByCep(String cep) throws IOException {
        Address address = addressRepository.findByCep(cep);
        if (address == null) {
            address = addressByViaCepService.getAddressByViaCep(cep);
            if (address.getCep() == null) {
                throw new CepNullContent("Esse cep não foi localizado na nossa base de dados.");
            } else {
                saveAddressByViaCep(address);
                return address;
            }
        }
        return address;
    }

    public void  saveAddressByViaCep(Address address) {
        addressRepository.save(address);
    }


}
