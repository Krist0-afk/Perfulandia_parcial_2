package com.perfulandia.carritoservice.model;


import lombok.*;
//DTO Data Transfer Object= Objeto de transferencia de datos: para simular la respuesta de MS
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Logistica {

    private long id;
    private String nombre;
    private String apellido;
    private String rut;
    private String vehiculo;
    private long capacidad;
    private String patente;
}
