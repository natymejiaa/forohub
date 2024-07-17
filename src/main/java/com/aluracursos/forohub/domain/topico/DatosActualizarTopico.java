package com.aluracursos.forohub.domain.topico;

import com.aluracursos.forohub.domain.curso.DatosCurso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String mensaje,
        StatusTopicos status,
        @Valid DatosCurso curso
) {}

