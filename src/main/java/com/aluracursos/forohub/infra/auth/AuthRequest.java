package com.aluracursos.forohub.infra.auth;


import jakarta.validation.constraints.NotBlank;

public record AuthRequest(
        @NotBlank(message = "El correo electronico es obligatorio")
        String correoElectronico,

        @NotBlank(message = "La contraseña es obligatoria")
        String contrasena
) {
}
