package edu.coder.trabajo.repository;

import edu.coder.trabajo.model.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaProductoRepository extends JpaRepository<VentaProducto, Long> {
}