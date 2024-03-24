package com.algaworks.awpag.domain.repository;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByNome(String nome);
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findById(Long clienteId);

}
