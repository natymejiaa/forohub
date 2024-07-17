package com.aluracursos.forohub.domain.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegistroUsuarioDTO(
        @NotBlank(message = "El campo nombre no esta diligenciado.")
        String nombre,

        @NotBlank(message = "El campo correo electrónico no esta diligenciado.")
        @Email(message = "Indique un correo electrónico válido.")
        String correoElectronico,

        @NotBlank(message = "El campo contraseña no esta diligenciado.")
        @Size(min = 6, max = 100, message = "La contraseña debe contener entre 6 y 100 caracteres.")
        String contrasena) {
}
