package edu.eci.arsw.happ.security;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import edu.eci.arsw.happ.model.User;

public interface UserService {
    List<User> listaUser();
    UserDetails loadUserByUsername(String s);
}