package com.perfulandia.pedidos.controller;

import com.perfulandia.pedidos.model.pedidoModel;
import com.perfulandia.pedidos.service.pedidoService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController // Esta clase va a manejar solicitudes web y va a responder con datos
@RequestMapping("/api/pfl/") // Sirve para definir la ruta base (URL raíz) de todos los métodos de esa clase.

public class pedidoController { //.

    private final pedidoService pedidoService;

    public pedidoController(pedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    //listar
    @GetMapping("/lista/pedidos") // se usa para manejar solicitudes
    public List<pedidoModel> listar(){
        return pedidoService.listar();
    }
    @PostMapping("/guardar/pedido") // Se usa típicamente para enviar datos al servidor,
    public pedidoModel guardar(@RequestBody pedidoModel pedidoModel){
        return pedidoService.guardar(pedidoModel);
    }
    @GetMapping("/buscar/pedido/{id}")
    public pedidoModel buscar(@PathVariable Long id){
        return pedidoService.buscar(id);
    }
    @DeleteMapping("/eliminar/pedido{id}") // Se usa para eliminar datos desde el servidor.
    public void eliminar(@PathVariable Long id){
        pedidoService.eliminar(id);
    }

}
