package edu.coder.trabajo.repository;


import edu.coder.trabajo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> { }