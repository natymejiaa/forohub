package com.aluracursos.forohub.domain.users;

public record RegistroUsuarioRespuestaDTO(
        Long id,
        String nombre,
        String correoElectronico,
        String contrasena,
        String mensaje
) {
    public RegistroUsuarioRespuestaDTO(Long id, String nombre, String correoElectronico, String contrasena) {
        this(id, nombre, correoElectronico, contrasena, "El usuario se ha registrado con exito");
    }
}
