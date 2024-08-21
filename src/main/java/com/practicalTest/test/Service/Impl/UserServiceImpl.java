package com.practicalTest.test.Service.Impl;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.practicalTest.test.Entity.User;
import com.practicalTest.test.Repository.UserRepository;
import com.practicalTest.test.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Value("${user.password.regex}")
    private String passwordRegex;

    @Value("${user.email.regex}")
    private String emailRegex;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        
        try{
            if (!Pattern.matches(emailRegex, user.getEmail())) {
                throw new IllegalArgumentException("Correo invalido");
            }

            if (!Pattern.matches(passwordRegex, user.getPassword())) {
                throw new IllegalArgumentException("Contraseña Invalida. Su contraseña debe contener al menos un caracter especial, mayuscula, minuscula, número. Y debe ser mayor a 8 caracteres");
            }

            Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
            if (existingUser.isPresent()) {
                throw new IllegalArgumentException("El correo ya está registrado");
            }

            user.setId(UUID.randomUUID().toString());
            user.setToken(UUID.randomUUID().toString());
            user.setLastlogin(LocalDateTime.now());
            user.getPhones().forEach(phone -> phone.setUserid(user.getId()));

            return userRepository.save(user);
        }catch(Exception ex){
            throw new IllegalArgumentException("Error al crear el usuario: Error: " + ex.getMessage());
        }
    }

}
