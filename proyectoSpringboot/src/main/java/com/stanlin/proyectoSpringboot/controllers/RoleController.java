package com.stanlin.proyectoSpringboot.controllers;

import com.stanlin.proyectoSpringboot.models.Role;
import com.stanlin.proyectoSpringboot.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private IRoleService service;

    @GetMapping("getRoles")
    public List<Role> getyRoles(){
        return service.getRoles();
    }

    @PostMapping("saveRole")
    public void saveRole(Role rol){
        service.saveRole(rol);
    }
}
