package com.example.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductoEntity {

    @Id
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "nombre_producto")
    private String nombrepro;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "categoria_producto")
    private String categoria;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "precio")
    private int precio;
}
