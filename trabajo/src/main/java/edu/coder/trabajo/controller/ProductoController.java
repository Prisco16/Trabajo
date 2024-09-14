package edu.coder.trabajo.controller;


import edu.coder.trabajo.model.Producto;
import edu.coder.trabajo.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/agregar")
    public ResponseEntity<Producto> agregarProducto(@Valid @RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.agregarProducto(producto));
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }

}
