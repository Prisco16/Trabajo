package edu.coder.trabajo.service;

import edu.coder.trabajo.model.Producto;
import edu.coder.trabajo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}
