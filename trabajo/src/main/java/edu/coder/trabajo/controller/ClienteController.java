package edu.coder.trabajo.controller;

import edu.coder.trabajo.model.Cliente;
import edu.coder.trabajo.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;


    @PostMapping("/agregar")
    public ResponseEntity<Cliente> agregarCliente(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.agregarCliente(cliente));
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }
    @GetMapping("/buscar/{id}")
    public Optional<Cliente> buscarCliente(@PathVariable Long id) {
        return clienteService.buscarCliente(id);
    }
}
