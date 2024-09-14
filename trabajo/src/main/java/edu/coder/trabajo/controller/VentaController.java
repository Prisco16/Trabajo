package edu.coder.trabajo.controller;

import edu.coder.trabajo.model.Venta;
import edu.coder.trabajo.model.VentaProducto;
import edu.coder.trabajo.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/crear/{clienteId}")
    public Venta RealizarVenta(
            @PathVariable Long clienteId,
            @RequestBody VentaProducto ventaProducto) {
        return ventaService.realizarVenta(clienteId,ventaProducto.getProducto().getId(), ventaProducto.getCantidad());
    }
}
