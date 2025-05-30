package com.perfulandia.carritoservice.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
//DTO Data Transfer Object= Objeto de transferencia de datos: para simular la respuesta de MS
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Logistica {
    @Id // indica que campo necesita una clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera automaticamente el valor del campo, como una ID
    // se utilizan en conjunto con el @Id

    private long id;
    private String nombre;
    private String apellido;
    private String rut;
    private String vehiculo;
    private long capacidad;
    private String patente;
}
