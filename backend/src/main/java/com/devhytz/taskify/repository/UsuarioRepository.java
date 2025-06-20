package com.devhytz.taskify.repository;

import com.devhytz.taskify.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Con solo extender a JpaRepository ya se implementan todos los metodos
    // de busqueda, entre otros, no hace falta definirlos.
}