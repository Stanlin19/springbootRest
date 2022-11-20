package com.stanlin.proyectoSpringboot.services;

import com.stanlin.proyectoSpringboot.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {

    List<Role> getRoles();
    void saveRole(Role rol);
}
