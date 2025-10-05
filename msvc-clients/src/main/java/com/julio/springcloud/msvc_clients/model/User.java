package com.julio.springcloud.msvc_clients.model;

import java.util.Date;

public record User(Long id, String dni, String nombre, String apellido, Date nacimiento) {

}
