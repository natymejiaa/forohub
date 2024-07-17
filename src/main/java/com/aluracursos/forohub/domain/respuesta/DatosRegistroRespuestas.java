package com.aluracursos.forohub.domain.respuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroRespuestas(
        @NotBlank(message = "Se requiere el texto del mensaje")
        String mensaje,

        @NotNull(message = "Se requiere el Id del tópico" )
        Long topicoId,

        @NotNull(message = "Se requiere el Id del autor")
        Long autorId
) {}
