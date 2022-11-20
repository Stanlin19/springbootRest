package com.stanlin.proyectoSpringboot.controllers;

import com.stanlin.proyectoSpringboot.models.Usuario;
import com.stanlin.proyectoSpringboot.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("getUsers")
    public List<Usuario> getUsers(){
        return service.getUsers();
    }

    @PostMapping("saveUser")
    public void saveUser(Usuario user){
        service.saveUser(user);
    }

    @PostMapping("findByMail")
    public Usuario findUserByMail(String mail){
        return service.getUserByMail(mail);
    }
}
