package com.perfulandia.carritoservice.service;

import com.perfulandia.carritoservice.model.Carrito;
import com.perfulandia.carritoservice.repository.CarritoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarritoService {

    private final CarritoRepository repo;
    public CarritoService(CarritoRepository repo) {
        this.repo = repo;
    }

    //mostrar carrito
    public List<Carrito> listar() {
        return repo.findAll();
    }

    //agregar producto al carrito
    public Carrito guardar(Carrito carrito){
        return repo.save(carrito);
    }

    //eliminar producto del carrito por id
    public void eliminar(Long id){
        repo.deleteById(id);
    }
}