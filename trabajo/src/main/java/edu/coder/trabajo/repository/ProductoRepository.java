package edu.coder.trabajo.repository;

import edu.coder.trabajo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> { }
