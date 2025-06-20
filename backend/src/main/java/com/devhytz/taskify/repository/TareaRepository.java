package com.devhytz.taskify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devhytz.taskify.model.Tarea;

// Se ponen los argumentos "Tarea" la cual es la entidad y "Long" que es el identificador
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
