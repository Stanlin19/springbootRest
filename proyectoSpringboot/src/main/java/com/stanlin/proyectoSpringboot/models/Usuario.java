package com.stanlin.proyectoSpringboot.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String mail;
    private String telephone;
    private String password;
    private boolean status;
    private String userName;
    @OneToOne
    @JoinColumn(name = "rol_id")
    private Role rol;



}
