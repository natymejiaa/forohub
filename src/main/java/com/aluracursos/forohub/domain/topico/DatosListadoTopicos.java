package com.aluracursos.forohub.domain.topico;

import com.aluracursos.forohub.domain.curso.Curso;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        LocalDateTime fechaCreacion,
        StatusTopicos status,
        Curso curso
) {
    public DatosListadoTopicos(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getFechaCreacion(),
                topico.getStatusTopicos(),
                topico.getCurso());
    }
}