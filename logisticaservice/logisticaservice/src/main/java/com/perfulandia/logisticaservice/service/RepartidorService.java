package com.perfulandia.logisticaservice.service;
import com.perfulandia.logisticaservice.model.Repartidor;
import com.perfulandia.logisticaservice.repository.RepartidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//findAll()
//findById(id)
//save()
//delete eliminar

@Service
public class RepartidorService {
    private final RepartidorRepository repo;
    //Constructor para injectar el repositorio
    public RepartidorService(RepartidorRepository repo) {
        this.repo = repo;
    }
    // Anotaciones o metodos
    //listar
    public List<Repartidor> listar() {
        return repo.findAll();//listar
    }
    //guardar repartidor
    public Repartidor guardar(Repartidor repartidor) {
        return repo.save(repartidor);//guardar repartidor
    }
    //buscar por ID
    public Repartidor buscar(long id) {
        return repo.findById(id).orElse(null);
    }
    //eliminar
    public void eliminar(long id) {
        repo.deleteById(id);
    }
    // Buscar por capacidad (luego)
    public List<Repartidor> buscarcapacidad(long capacidad) {
        return repo.findByCapacidad(capacidad);
    }

}
