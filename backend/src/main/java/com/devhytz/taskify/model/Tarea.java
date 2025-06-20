package com.devhytz.taskify.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tareas")
public class Tarea {
    
    @Id // Define el campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental (para bases tipo H2, MySQL, etc.)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private boolean estado;

    // Constructor vacio requerido por JPA
    public Tarea() {}

    // Constructor parametrizado    
    public Tarea(Long id, String nombre, String descripcion, boolean estado) {

        if (id != 5) {
            throw new IllegalArgumentException("El ID debe ser de 5 caracteres");
        } else {
            this.id = id;
        }

        if (nombre.length() < 1) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }

        if (descripcion.length() < 1) {
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        } else {
            this.descripcion = descripcion;
        }

        this.estado = estado;

    }

    // SETTERS Y GETTERS

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    // Saber en que estado se encuentra

    public String estadoActual(boolean estado) {
        if (estado) {
            return "Completada";
        } else {
            return "Pendiente";
        }
    }

    // Overrides

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: " + id +
        " | Nombre: " + nombre +
        " | Descripcion: " + descripcion +
        " | Estado: " + estadoActual(estado);
    }
    
}
