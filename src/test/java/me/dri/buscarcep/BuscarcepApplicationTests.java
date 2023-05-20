package me.dri.buscarcep;

import me.dri.buscarcep.model.Address;
import me.dri.buscarcep.services.AddressService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class BuscarcepApplicationTests {


	@Autowired
	private AddressService service;

	@Test
	void contextLoads() {

	}

}