package com.certificados.demo.models;




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
@Table(name = "estado")
public class EstadoModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long idestado;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List <TieneModel> tienes;

    public EstadoModel() {
    }

    public EstadoModel(List<TieneModel> tienes) {
        this.tienes = tienes;
    }


    


    public long getIdestado() {
        return idestado;
    }

    public void setIdestado(long idestado) {
        this.idestado = idestado;
    }

    public List<TieneModel> getTienes() {
        return tienes;
    }

    public void setTienes(List<TieneModel> tienes) {
        this.tienes = tienes;
    }

   

}

    
