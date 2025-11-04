package com.example.demo.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UsuarioEntity {
    @Id
    @Column(name = "id_usuario")
    private Long idusu;
    @Column(name = "email")
    private String email;
    @Column(name = "email")
    private String contraseña;
    @Column(name = "rol")
    private String rol;
    

}
