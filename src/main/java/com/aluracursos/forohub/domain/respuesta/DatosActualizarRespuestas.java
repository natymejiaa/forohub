package com.aluracursos.forohub.domain.respuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuestas(
        @NotNull(message = "El ID es obligatorio")
        Long id,

        @NotBlank(message = "El texto del mensaje es obligatorio")
        String mensaje
) {}
