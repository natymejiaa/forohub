package com.aluracursos.forohub.domain.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DatosUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String correoElectronico,
        @NotBlank
        @Size(min = 6, message = "La contraseña debe contener al menos 6 caracteres")
        String contrasena
) {
}