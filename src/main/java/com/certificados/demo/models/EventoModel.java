package com.certificados.demo.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="evento")
public class EventoModel {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique =true , nullable =false)
    private long idevento;
    private String nombre;
     @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private ArrayList<CertificadoModel> certificados;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List <EmiteModel> emites;


    public EventoModel() {
    }
  

    public EventoModel(String nombre) {
        this.nombre = nombre;
    }

    public EventoModel(String nombre,ArrayList<CertificadoModel> certificados) {
        this.nombre = nombre;
        this.certificados = certificados;
    }

    public EventoModel(ArrayList<CertificadoModel> certificados, List<EmiteModel> emites, String nombre) {
        this.certificados = certificados;
        this.emites = emites;
        this.nombre = nombre;
    }
    
    public long getIdevento() {
        return idevento;
    }

    public void setIdevento(long idevento) {
        this.idevento = idevento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void addCertificado(CertificadoModel certificado) {
        certificados.add(certificado);
        certificado.setEvento(this);
    }

    public void removeCertificado(CertificadoModel certificado) {
        certificados.remove(certificado);
        certificado.setEvento(null);
    }

    public ArrayList<CertificadoModel> getCertificados() {
        return certificados;
    }

    public void setCertificados(ArrayList<CertificadoModel> certificados) {
        this.certificados = certificados;
    }

    public List<EmiteModel> getEmites() {
        return emites;
    }

    public void setEmites(List<EmiteModel> emites) {
        this.emites = emites;
    }


}