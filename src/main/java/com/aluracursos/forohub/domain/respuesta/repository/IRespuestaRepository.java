package com.aluracursos.forohub.domain.respuesta.repository;

import com.aluracursos.forohub.domain.respuesta.Respuesta;
import com.aluracursos.forohub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRespuestaRepository extends JpaRepository<Respuesta, Long> {
    List<Respuesta> findByTopicoAndActivoTrue(Topico topico);
}

