/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="CEP")
@XmlRootElement(name="cep")
@NamedQueries({
    @NamedQuery(name = "Local.findByCep"        , query  = "select c "
                                                         + "     from Cep c "
                                                         + "     where b.CEP = :CEP"
                ),//findByCep
    
    @NamedQuery(name = "Local.findByCidade"     , query = "select c from CEP c "
                                                        + "     where c.Cidade = :Cidade"
                ),//findByCidad 
    @NamedQuery(name = "Local,findByLogradouro" , query = " select c "
                                                        + "       from CEP c "
                                                        + "       where c.Logradour = :logradouro"
                                                                                
                )// findByLogradouro
    
})// NamedQueries
public class CEP extends AbstractEntity {
    
    @Column(length = 8, nullable = false , unique = true)
    private String  CEP;
    
    @ManyToOne
    private Cidade cidade;
    
    @OneToMany(mappedBy = "CEP")
    private Set<Logradouro> logradouros;
    
    //*******************************************
    // CONSTRUTORS
    //

    public CEP() {
    }

    public CEP(String CEP, Cidade cidade, Set<Logradouro> logradouros) {
        this.CEP         = CEP;
        this.cidade      = cidade;
        this.logradouros = logradouros;
    }// CEP

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Set<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(Set<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }

    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
