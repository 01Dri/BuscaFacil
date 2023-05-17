package me.dri.buscarcep.services;


import me.dri.buscarcep.exception.CepNullContent;
import me.dri.buscarcep.model.Address;
import me.dri.buscarcep.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AddressByViaCepService addressByViaCepService;

    public Address findByCep(String cep) throws IOException {
        Address address = addressRepository.findByCep(cep);
        if (address == null) {
            address = addressByViaCepService.getViaCepAddress(cep);
            if (address.getCep() == null) {
                throw new CepNullContent("Esse cep não foi localizado na nossa base de dados.");
            } else {
               checkDuplicates(address, getAddressList());
            }
        }
        return address;
    }

    public List<Address> getAddressList() {
        return addressRepository.findAll();
    }


    public void checkDuplicates(Address address, List<Address> addressList) {
        if (!addressList.contains(address)) {
            addressRepository.save(address);
        }
    }
}
