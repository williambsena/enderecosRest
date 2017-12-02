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
@Table(name="Logradouro")
@XmlRootElement(name = "logradouro")
@NamedQueries({
    @NamedQuery(name = "Local.findByLogradouro" , query = "select l "
                                                        + "     from Logradouro l "
                                                        + "     where l.sLogradouro = :sLogradouro"
                ),//findByLogradouro
    
    @NamedQuery(name = "Local.findByCep"        , query = "select l from Logradouro l "
                                                        + "     where l.CEP = :CEP"
                )//findByCep
    
})// NamedQueries

public class Logradouro extends AbstractEntity {
    
    @Column(length = 255 , nullable = false)
    private String sLogradouro;
    
    @Column(length = 8 , nullable = false)
    private String sNumero;
    
    @Column(length = 155 , nullable = true)
    private String sComplemento;
   
    @Enumerated(EnumType.STRING)
    private TpLogradouro tpLogradouro1 ;
    
    @ManyToOne
    private CEP cep;
    
    @ManyToOne
    private Bairro bairro;
    
    @OneToMany(mappedBy = "logradouro")
    private Set<Pessoa> moradores;
    
    

    public Logradouro() {
    }

    public Logradouro(String sLogradouro, String sNumero, String sComplemento, TpLogradouro tpLogradouro1, CEP cep, Bairro bairro, Set<Pessoa> moradores) {
        this.sLogradouro = sLogradouro;
        this.sNumero = sNumero;
        this.sComplemento = sComplemento;
        this.tpLogradouro1 = tpLogradouro1;
        this.cep = cep;
        this.bairro = bairro;
        this.moradores = moradores;
    }

    public String getsLogradouro() {
        return sLogradouro;
    }

    public void setsLogradouro(String sLogradouro) {
        this.sLogradouro = sLogradouro;
    }

    public String getsNumero() {
        return sNumero;
    }

    public void setsNumero(String sNumero) {
        this.sNumero = sNumero;
    }

    public String getsComplemento() {
        return sComplemento;
    }

    public void setsComplemento(String sComplemento) {
        this.sComplemento = sComplemento;
    }

    public TpLogradouro getTpLogradouro1() {
        return tpLogradouro1;
    }

    public void setTpLogradouro1(TpLogradouro tpLogradouro1) {
        this.tpLogradouro1 = tpLogradouro1;
    }

    public CEP getCep() {
        return cep;
    }

    public void setCep(CEP cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Set<Pessoa> getMoradores() {
        return moradores;
    }

    public void setMoradores(Set<Pessoa> moradores) {
        this.moradores = moradores;
    }

    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}/* FIM -> Logradouro */ 
