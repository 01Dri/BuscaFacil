package me.dri.buscarcep.config;

import me.dri.buscarcep.model.Address;
import me.dri.buscarcep.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;



@Configuration
public class TesteConfigDB implements CommandLineRunner {


    @Autowired
    private AddressRepository addressRepository;
    @Override
    public void run(String... args) throws Exception {
        addressRepository.deleteAll();
        Address address1 = new Address(null, "diego", "123", "123", "123", "123", "123", "123", "123", "123");
        addressRepository.save(address1);

    }
}
