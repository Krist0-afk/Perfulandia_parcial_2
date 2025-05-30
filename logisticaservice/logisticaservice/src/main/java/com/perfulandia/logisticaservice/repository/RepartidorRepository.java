package com.perfulandia.logisticaservice.repository;
import com.perfulandia.logisticaservice.model.Repartidor;
//importar JPA para trabajar con CRUD
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// hereda de jpa y gestiona la interzas repartidores con una id long

public interface RepartidorRepository extends JpaRepository<Repartidor, Long> {
    List<Repartidor> findByCapacidad(Long capacidad);//filtrar repartidores por capacidad
}