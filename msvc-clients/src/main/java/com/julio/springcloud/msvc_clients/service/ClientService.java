package com.julio.springcloud.msvc_clients.service;

import java.util.List;
import java.util.Optional;

import ch.qos.logback.core.net.server.Client;

public interface ClientService {

    List<Client> findAll();
    Optional<Client> findById(Long id);
    String generarContrasenia();

}
