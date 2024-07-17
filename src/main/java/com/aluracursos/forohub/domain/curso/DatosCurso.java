package com.aluracursos.forohub.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso(
        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @NotBlank(message = "La categoría es obligatoria")
        String categoria
) {}


