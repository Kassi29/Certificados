package com.certificados.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "firma")
public class FirmaModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idfirma;

    @ManyToOne
    @JoinColumn(name = "certificado_id", referencedColumnName = "idcertificado")
    private CertificadoModel certificado;

    @ManyToOne
    @JoinColumn(name = "autoridad_id", referencedColumnName = "idpersona")
    private AutoridadModel autoridad;

    public FirmaModel() {
    }

    public FirmaModel(AutoridadModel autoridad, CertificadoModel certificado) {
        this.autoridad = autoridad;
        this.certificado = certificado;
    }



    public long getIdfirma() {
        return idfirma;
    }

    public void setIdfirma(long idfirma) {
        this.idfirma = idfirma;
    }

    public CertificadoModel getCertificado() {
        return certificado;
    }

    public void setCertificado(CertificadoModel certificado) {
        this.certificado = certificado;
    }

    public AutoridadModel getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(AutoridadModel autoridad) {
        this.autoridad = autoridad;
    }



}
