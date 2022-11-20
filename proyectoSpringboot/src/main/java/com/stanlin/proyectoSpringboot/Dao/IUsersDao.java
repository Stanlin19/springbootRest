package com.stanlin.proyectoSpringboot.Dao;

import com.stanlin.proyectoSpringboot.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersDao extends JpaRepository<Usuario, Long> {

    Usuario findOneByMail(String mail);
    Usuario findOneByUserName(String userName);
}
