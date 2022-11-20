package com.stanlin.proyectoSpringboot.Dao;

import com.stanlin.proyectoSpringboot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolDao extends JpaRepository<Role, Long> {

    Role getRoleByName(String name);
}
