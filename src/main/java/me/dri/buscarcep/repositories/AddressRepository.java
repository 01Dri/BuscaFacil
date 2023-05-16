package me.dri.buscarcep.repositories;

import me.dri.buscarcep.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository  extends MongoRepository<Address, String> {

    Address findByCep(String cep);

}
