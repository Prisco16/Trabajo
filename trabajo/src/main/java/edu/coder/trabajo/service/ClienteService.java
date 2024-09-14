package edu.coder.trabajo.service;


import edu.coder.trabajo.model.Cliente;
import edu.coder.trabajo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
    public Optional<Cliente> buscarCliente(Long id) {
        return clienteRepository.findById(id);
    }
}
