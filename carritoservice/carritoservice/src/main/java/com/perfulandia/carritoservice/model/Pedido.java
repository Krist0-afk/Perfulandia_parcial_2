package com.perfulandia.carritoservice.model;

import lombok.*;
//DTO Data Transfer Object= Objeto de transferencia de datos: para simular la respuesta de MS
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private int id;
    private String usuarioId;
    private String producto;
    private String descripcion;
    private String estado;

}
