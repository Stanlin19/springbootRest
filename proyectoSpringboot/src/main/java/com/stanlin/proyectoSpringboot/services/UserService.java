package com.stanlin.proyectoSpringboot.services;

import com.stanlin.proyectoSpringboot.Dao.IUsersDao;
import com.stanlin.proyectoSpringboot.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUsersDao dao;

    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    public void saveUser(Usuario user) {
        user.setPassword(encoder.encode(user.getPassword()));
        dao.save(user);
    }

    @Override
    public List<Usuario> getUsers() {
        return dao.findAll();
    }

    @Override
    public Usuario getUserByMail(String mail) {
        return dao.findOneByMail(mail);
    }

}
