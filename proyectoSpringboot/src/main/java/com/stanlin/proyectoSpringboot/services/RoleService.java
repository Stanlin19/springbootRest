package com.stanlin.proyectoSpringboot.services;

import com.stanlin.proyectoSpringboot.Dao.IRolDao;
import com.stanlin.proyectoSpringboot.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService{

    @Autowired
    private IRolDao dao;

    @Override
    public List<Role> getRoles() {
        return dao.findAll();
    }

    @Override
    public void saveRole(Role rol) {
        dao.save(rol);
    }
}
