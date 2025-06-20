package com.devhytz.taskify.model;

import jakarta.persistence.*;

@Entity // Marca esta clase como una entidad (tabla en BD)
@Table(name = "usuarios") // Opcional: nombre de la tabla
public class Usuario {

    @Id // Define el campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental (para bases tipo H2, MySQL, etc.)
    private Long id;

    @Column(nullable = false) // No permite null en la columna
    private String nombre;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    // Constructor vacío requerido por JPA
    public Usuario() {}

    public Usuario(Long id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
