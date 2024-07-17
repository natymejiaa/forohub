package com.aluracursos.forohub.domain.topico;

import com.aluracursos.forohub.domain.curso.DatosCurso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank(message = "Se requiere el título")
        String titulo,

        @NotBlank(message = "Se requiere el mensaje de texto")
        String mensaje,

        @NotNull(message = "Se requiere la fecha de creación ")
        LocalDateTime fechaCreacion,

        @NotNull(message = "Se requiere el estado del tópico ")
        StatusTopicos statusTopicos,

        @NotNull(message = "Se requiere el curso")
        @Valid
        DatosCurso curso
) {}
