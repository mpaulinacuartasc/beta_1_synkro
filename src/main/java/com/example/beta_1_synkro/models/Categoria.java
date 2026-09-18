package com.example.beta_1_synkro.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "categorias")
public class Categoria {

    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column (name= "nombre", nullable = false, unique = false, length = 50)
    private String nombre;

    @Column (name = "categoria", nullable = false , unique = true,length = 80)
    private String categoria;

    @Column (name = "Descripcion",nullable = false, unique = true, length = 400)
    private String descripcion;

    //@OneToMany (mappedBy = "categoria")
    //@JsonManageReference ("reto_usuario")
    // private list<Reto>retos;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
