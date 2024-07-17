package com.aluracursos.forohub.Controller;

import com.aluracursos.forohub.domain.topico.DatosActualizarTopico;
import com.aluracursos.forohub.domain.topico.DatosListadoTopicos;
import com.aluracursos.forohub.domain.topico.DatosRegistroTopico;
import com.aluracursos.forohub.domain.topico.RegistroTopicoRespuestaDTO;
import com.aluracursos.forohub.domain.topico.service.TopicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<RegistroTopicoRespuestaDTO> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String correoElectronico = authentication.getName();
        RegistroTopicoRespuestaDTO respuesta = topicoService.registrarTopico(datosRegistroTopico, correoElectronico);
        return ResponseEntity.status(201).body(respuesta);
    }

    @GetMapping("/listar")
    public ResponseEntity<Page<DatosListadoTopicos>> listarTopicos(
            @PageableDefault(size = 5, sort = "fechaCreacion") Pageable paginacion) {
        return ResponseEntity.ok(topicoService.listarTopicos(paginacion));
    }

    @PutMapping
    public ResponseEntity<RegistroTopicoRespuestaDTO> actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        RegistroTopicoRespuestaDTO respuesta = topicoService.actualizarTopico(datosActualizarTopico);
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<RegistroTopicoRespuestaDTO> obtenerDatosTopicoPorId(@PathVariable Long id) {
        RegistroTopicoRespuestaDTO respuesta = topicoService.obtenerDatosTopicoPorId(id);
        return ResponseEntity.ok(respuesta);
    }

    @DeleteMapping("/baja/{id}")
    public ResponseEntity<?> eliminarLogicamenteTopico(@PathVariable Long id) {
        topicoService.borrarTopicoLogico(id);
        return ResponseEntity.ok().body("Tópico eliminado lógicamente con éxito.");
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarFisicamenteTopico(@PathVariable Long id) {
        topicoService.borrarTopicoPermanente(id);
        return ResponseEntity.ok().body("Tópico eliminado permanentemente con éxito.");
    }
}

