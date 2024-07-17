package com.aluracursos.forohub.domain.curso.repository;

import com.aluracursos.forohub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
    Optional<Curso> findByNombre(String nombre);
}

