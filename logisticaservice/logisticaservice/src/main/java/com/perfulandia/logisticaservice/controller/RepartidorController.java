package com.perfulandia.logisticaservice.controller;

import com.perfulandia.logisticaservice.model.Repartidor;
import com.perfulandia.logisticaservice.service.RepartidorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController  // Esta clase va a manejar solicitudes web y va a responder con datos
@RequestMapping("/api/Repartidores") // Sirve para definir la ruta base (URL raíz) de todos los métodos de esa clase.

public class RepartidorController { //.
    private final RepartidorService service;
    public RepartidorController(RepartidorService service) {
        this.service = service;
    }
    //listar
    @GetMapping("/listar/repartidores") // se usa para manejar solicitudes
    public List<Repartidor> listar() {
        return service.listar();
    }
    //guardar
    @PostMapping("/guardar/repartidores") // Se usa típicamente para enviar datos al servidor,
    public Repartidor guardar(@RequestBody Repartidor repartidor) {
        return service.guardar(repartidor);
    }
    //buscar por id
    @GetMapping("/buscar/{id}")
    public Repartidor buscar(@PathVariable long id) {
        return service.buscar(id);
    }
    //eliminar
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable long id) {
        service.eliminar(id);
    }
    //buscar por capacidad
    @GetMapping("/capacidad/repartidor") // Se usa para eliminar datos desde el servidor.
    public List<Repartidor> buscarcapacidad(@RequestParam long capacidad) {

        return service.buscarcapacidad(capacidad);
    }


}
