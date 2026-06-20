package com.itsqmet.evaluacionuno.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table (name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El campo modelo es obligatorio")
    @Size(min = 3, max = 100, message = ("El modelo no cumple con el rango de caracteres de 3-100"))
    private String modelo;

    @NotBlank(message = "El campo nombre no puede estar vacio")
    private String categoria;

    @Size(max = 255, message = "La descripción no puede superar 255 caracteres")
    private String descripcion;

    @NotNull(message = "El campo precio por día es obligatorio")
    @Positive(message = "El precio por día debe ser mayor a 0")
    private Double precioPorDia;

    @NotNull(message = "El número de unidades disponibles es obligatorio")
    @Min(value = 0, message = "El número de unidades disponibles no puede ser negativo")
    private Integer unidadesDisponibles;


    public Vehiculo() {
    }

    public Vehiculo(Long id, String modelo, String categoria, String descripcion, Double precioPorDia, Integer unidadesDisponibles) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precioPorDia = precioPorDia;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public Double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(Double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
}
