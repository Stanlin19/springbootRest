package com.stanlin.proyectoSpringboot.services;

import com.stanlin.proyectoSpringboot.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {

    void saveUser(Usuario user);
    List<Usuario> getUsers();
    Usuario getUserByMail(String mail);
}
