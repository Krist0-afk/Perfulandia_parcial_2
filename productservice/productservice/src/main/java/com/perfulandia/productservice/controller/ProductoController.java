package com.perfulandia.productservice.controller;
import com.perfulandia.productservice.model.Usuario;
import com.perfulandia.productservice.model.Producto;
import com.perfulandia.productservice.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//Nuevas importaciones DTO conexión al MS usuario
import org.springframework.web.client.RestTemplate;
//Para hacer peticiones HTTP a otros microservicios.


@RestController
@RequestMapping("/api/productos")
public class ProductoController {



    private final ProductoService servicio;
    private final RestTemplate restTemplate;
    public ProductoController(ProductoService servicio,  RestTemplate restTemplate){
        this.servicio = servicio;
        this.restTemplate = restTemplate;
    }

    //listar
    @GetMapping("/listar/producto")
    public List<Producto> listar(){
        return servicio.listar();
    }
    //guardar
    @PostMapping("/guardar/producto")
    public Producto guardar(@RequestBody Producto producto){
        return servicio.guardar(producto);
    }
    //buscar x id
    @GetMapping("/buscar/producto{id}")
    public Producto buscar(@PathVariable long id){
        return servicio.bucarPorId(id);
    }
    //Eliminar
    @DeleteMapping("/eliminar/producto/{id}")
    public void eliminar(@PathVariable long id){
        servicio.eliminar(id);
    }

    //Nuevo método
    @GetMapping("/usuario/{id}")
    public Usuario obtenerUsuario(@PathVariable long id){
        return restTemplate.getForObject("http://localhost:8081/api/usuarios/"+id,Usuario.class);
    }
}
