/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Willi
 */
@Entity
@Table(name = "Cidade")
@XmlRootElement(name = "cidade")

@NamedQueries({
    @NamedQuery(name = "Evento.findByNome"  , query = "select c "
                                                    + "     from Cidade c "
                                                    + "     where c.nome   = :nome"   
                ),//findByNome
    @NamedQuery(name = "Evento.findByCep"   , query = "select c "
                                                    + "     from Cidade c "
                                                    + "     where c.cep    = :cep"    
                ),//findByCep
    
}) 
    
public class Cidade extends AbstractEntity {
    
    @Column(length = 155, nullable = false)
    private String  sNomeCidade;
    
    @ManyToOne
    private Estado estado;
    
    @ManyToOne
    private Pais pais;  
   
    
    @OneToMany(mappedBy = "cidade")
    private Set<Bairro> barriros;
    
    @OneToMany(mappedBy = "cidade")
    private Set<CEP> CEPS;
    

    //*******************************
    // CONSTRUTORES
    //
    
    public Cidade(String sNomeCidade, Estado estado,Pais pais, Set<Bairro> barriros, Set<CEP> CEPS) {
        this.sNomeCidade = sNomeCidade;
        this.estado      = estado;
        this.pais        = pais;
        this.barriros    = barriros;
        this.CEPS        = CEPS;
    }//FIM -> Cidade()`

    public Cidade() {
    } //Cidade()

    public String getsNomeCidade() {
        return sNomeCidade;
    }

    public void setsNomeCidade(String sNomeCidade) {
        this.sNomeCidade = sNomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Pais getpais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Set<Bairro> getBarriros() {
        return barriros;
    }

    public void setBarriros(Set<Bairro> barriros) {
        this.barriros = barriros;
    }

    public Set<CEP> getCEPS() {
        return CEPS;
    }

    public void setCEPS(Set<CEP> CEPS) {
        this.CEPS = CEPS;
    }
    
    
    @Override
    public void updateParameters(Object entity) {
        Cidade other     = (Cidade) entity;
        this.sNomeCidade = other.sNomeCidade;
        this.estado      = other.estado;
        this.pais        = other.pais;
        this.barriros    = other.barriros;
        this.CEPS        = other.CEPS;
        
    }//fim updateParameters()
    
    
     
    
    
}/*FIM -> Cidade */
