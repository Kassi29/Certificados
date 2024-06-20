package com.certificados.demo.models;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "unidad")
public class UnidadModel {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique =true , nullable =false)
    private long idunidad;
    private long idpapa;
    private String nombre;

    @OneToMany(mappedBy = "unidad", cascade = CascadeType.ALL)
    private List <EmiteModel> emites;

    @OneToMany(mappedBy = "unidadPadre", cascade = CascadeType.ALL)
    private List<UnidadModel> subunidades; // Lista de subunidades

    @ManyToOne
    @JoinColumn(name = "unidad_padre_id")
    private UnidadModel unidadPadre;

 

    public UnidadModel() {
    }

    public UnidadModel(long idpapa, String nombre) {
        this.idpapa = idpapa;
        this.nombre = nombre;
    }

    public UnidadModel(List<EmiteModel> emites, long idpapa, String nombre) {
        this.emites = emites;
        this.idpapa = idpapa;
        this.nombre = nombre;
    }

    

    public UnidadModel(long idpapa, String nombre, List<UnidadModel> subunidades) {
        this.idpapa = idpapa;
        this.nombre = nombre;
        this.subunidades = subunidades;
    }


    public long getIdunidad() {
        return idunidad;
    }

    public void setIdunidad(long idunidad) {
        this.idunidad = idunidad;
    }

    public long getIdpapa() {
        return idpapa;
    }

    public void setIdpapa(long idpapa) {
        this.idpapa = idpapa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EmiteModel> getEmites() {
        return emites;
    }

    public void setEmites(List<EmiteModel> emites) {
        this.emites = emites;
    }

    public List<UnidadModel> getSubunidades() {
        return subunidades;
    }

    public void setSubunidades(List<UnidadModel> subunidades) {
        this.subunidades = subunidades;
    }

    public UnidadModel getUnidadPadre() {
        return unidadPadre;
    }

    public void setUnidadPadre(UnidadModel unidadPadre) {
        this.unidadPadre = unidadPadre;
    }



}
