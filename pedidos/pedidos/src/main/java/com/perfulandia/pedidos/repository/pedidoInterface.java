package com.perfulandia.pedidos.repository;

import com.perfulandia.pedidos.model.pedidoModel;
//importar JPA Repository para trabajar con CRUD
import org.springframework.data.jpa.repository.JpaRepository;
//Interfaz hereda de JPA y gestiona la entidad usuario con ID long

public interface pedidoInterface extends JpaRepository<pedidoModel, Long> {





}
