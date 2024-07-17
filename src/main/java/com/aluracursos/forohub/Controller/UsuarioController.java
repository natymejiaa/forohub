package com.aluracursos.forohub.Controller;

import com.aluracursos.forohub.domain.users.RegistroUsuarioDTO;
import com.aluracursos.forohub.domain.users.RegistroUsuarioRespuestaDTO;
import com.aluracursos.forohub.domain.users.service.UsuarioService;
import com.aluracursos.forohub.infra.errors.DuplicateResourceException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public ResponseEntity<?> registrarUsuario(@RequestBody @Valid RegistroUsuarioDTO registroUsuarioDTO) {
        try {
            RegistroUsuarioRespuestaDTO respuesta = usuarioService.registrarUsuario(registroUsuarioDTO);
            return ResponseEntity.status(201).body(respuesta);
        } catch (DuplicateResourceException e) {
            return ResponseEntity.status(409).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al registrar el usuario: " + e.getMessage());
        }
    }
}