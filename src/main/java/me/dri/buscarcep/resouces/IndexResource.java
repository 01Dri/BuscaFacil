package me.dri.buscarcep.resouces;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/buscar")
public class IndexResource {


    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public Resource getIndexPage() {
        return new ClassPathResource("templates/index.html");
    }



}
