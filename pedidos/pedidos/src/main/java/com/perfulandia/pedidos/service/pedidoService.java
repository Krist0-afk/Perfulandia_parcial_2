package com.perfulandia.pedidos.service;

import com.perfulandia.pedidos.model.pedidoModel;
import com.perfulandia.pedidos.repository.pedidoInterface;
import org.springframework.stereotype.Service;
import java.util.List;

@Service


public class pedidoService {

    private final pedidoInterface repo;
    //constructor para inyectar el repositorio
    public pedidoService(pedidoInterface repo) {
        this.repo = repo;

    }
    public List<pedidoModel> listar(){
        return repo.findAll();
    }
    //Guarda los pedidos
    public pedidoModel guardar(pedidoModel pedido){
        return repo.save(pedido);
    }
    //busca los pedidos
    public pedidoModel buscar (Long id){
        return repo.findById(id).orElse(null);
    }
    //elimina los pedidos
    public void eliminar(Long id){
        repo.deleteById(id);
    }


}
