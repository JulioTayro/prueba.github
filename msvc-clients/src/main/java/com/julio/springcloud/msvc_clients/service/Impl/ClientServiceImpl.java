package com.julio.springcloud.msvc_clients.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.springcloud.msvc_clients.client.UserFeignClient;
import com.julio.springcloud.msvc_clients.model.User;
import com.julio.springcloud.msvc_clients.service.ClientService;

import ch.qos.logback.core.net.server.Client;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public List<Client> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Client> findById(Long id) {
        User user = userFeignClient.details(id).getBody();

        String usuario = user.nombre().toLowerCase() + "." + user.apellido().toLowerCase();
        String contrasenia = generarContrasenia();

        return Optional.of(new Client(user, usuario, contrasenia));
    }

    @Override
    public String generarContrasenia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarContrasenia'");
    }

}
