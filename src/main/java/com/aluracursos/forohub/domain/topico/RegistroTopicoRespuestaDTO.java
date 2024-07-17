package com.aluracursos.forohub.domain.topico;

public record RegistroTopicoRespuestaDTO(
        Long id,
        Long cursoId,
        Long autorId,
        String mensajeExito
) {
    public RegistroTopicoRespuestaDTO(Long id, Long cursoId, Long autorId) {
        this(id, cursoId, autorId, "Registro exitoso");
    }

    public RegistroTopicoRespuestaDTO(String mensajeExito) {
        this(null, null, null, mensajeExito);
    }
}