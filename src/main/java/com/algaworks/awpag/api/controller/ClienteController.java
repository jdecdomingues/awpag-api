package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")

    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setTelefone("21 99999-9999");
        cliente1.setEmail("teste@teste.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("21 99999-9999");
        cliente2.setEmail("teste@teste.com");

        var cliente3 = new Cliente();
        cliente3.setId(3L);
        cliente3.setNome("Maria xpto");
        cliente3.setTelefone("21 99999-9999");
        cliente3.setEmail("teste@teste.com");

        return Arrays.asList(cliente1, cliente2, cliente3);
    }
}
