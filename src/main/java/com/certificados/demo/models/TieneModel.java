package com.certificados.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tiene")
public class TieneModel {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique =true , nullable =false)
    private long idtiene;
    private float nota;
    

    @ManyToOne
    @JoinColumn(name = "certificado_id", referencedColumnName = "idcertificado")
    private CertificadoModel certificado;

    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "idestado")
    private EstadoModel estado;

    public TieneModel() {
    }

    
    public TieneModel(CertificadoModel certificado, EstadoModel estado) {
        this.certificado = certificado;
        this.estado = estado;
    }

    public TieneModel(CertificadoModel certificado, EstadoModel estado, float nota) {
        this.certificado = certificado;
        this.estado = estado;
        this.nota = nota;
    }

    public TieneModel(CertificadoModel certificado, float nota) {
        this.certificado = certificado;
        this.nota = nota;
    }



    public long getIdtiene() {
        return idtiene;
    }

    public void setIdtiene(long idtiene) {
        this.idtiene = idtiene;
    }

    public CertificadoModel getCertificado() {
        return certificado;
    }

    public void setCertificado(CertificadoModel certificado) {
        this.certificado = certificado;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    



}
