package com.certificados.demo.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;



@Entity
@Table(name = "certificado")
public class CertificadoModel {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique =true , nullable =false)
    private long idcertificado;

    @ManyToOne
    @JoinColumn(name = "participante_id", referencedColumnName = "idpersona")
    private ParticipanteModel participante;

    @ManyToOne 
    @JoinColumn(name = "evento_id", referencedColumnName = "idevento")
    private EventoModel evento;

    @OneToMany(mappedBy = "certificado", cascade = CascadeType.ALL)
    private ArrayList <TieneModel> tienes;

    @OneToMany(mappedBy = "certificado", cascade = CascadeType.ALL)
    private List <FirmaModel> firmas;

    
    


    

    public CertificadoModel() {
    }


    public CertificadoModel(ParticipanteModel participante, EventoModel evento) {
        this.participante = participante;
        this.evento=evento;
    }

    public CertificadoModel(EventoModel evento, ParticipanteModel participante, ArrayList<TieneModel> tienes) {
        this.evento = evento;
        this.participante = participante;
        this.tienes = tienes;
    }


    public long getIdcertificado() {
        return idcertificado;
    }

    public void setIdcertificado(long idcertificado) {
        this.idcertificado = idcertificado;
    }

    public ParticipanteModel getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteModel participante) {
        this.participante = participante;
    }

    public EventoModel getEvento() {
        return evento;
    }

    public void setEvento(EventoModel evento) {
        this.evento = evento;
    }

    public ArrayList<TieneModel> getTienes() {
        return tienes;
    }

    public void setTienes(ArrayList<TieneModel> tienes) {
        this.tienes = tienes;
    }

    public List<FirmaModel> getFirmas() {
        return firmas;
    }

    public void setFirmas(List<FirmaModel> firmas) {
        this.firmas = firmas;
    }

   

    



}
