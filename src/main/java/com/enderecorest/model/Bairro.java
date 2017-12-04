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
import org.hibernate.annotations.Columns;

/**
 *
 * @author Willi
 */
@Entity
@Table(name="Bairro")
@XmlRootElement(name="bairro")
@NamedQueries({
    @NamedQuery(name = "Local.findByNome" , query = "select b "
                                                  + "     from Bairro b "
                                                  + "     where b.nome = :nome"
                ),//findByNome
    
    @NamedQuery(name = "Local.findByCidade"  , query = "select b from Bairro b "
                                                        + "     where b.Cidade = :Cidade"
                )//findByCidade
    
})// NamedQueries
public class Bairro extends AbstractEntity {
    
    @Column(length = 255 , nullable = false)
    private String nome;
    
    @ManyToOne
    private Cidade cidade;
    
    @OneToMany
    private Set<Logradouro> logradouros;
    
    @OneToMany
    private Set<CEP> ceps;
    
    
    //**************************************
    // CONSTRUTORES
    //

    public Bairro() {
    }// Bairro()

    public Bairro(String nome, CEP cep, Cidade cidade, Set<Logradouro> logradouros, Set<CEP> ceps) {
        this.nome        = nome;
        this.cidade      = cidade;
        this.logradouros = logradouros;
        this.ceps        = ceps;
    }// Bairro();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Set<CEP> getCeps() {
        return ceps;
    }

    public void setCeps(Set<CEP> ceps) {
        this.ceps = ceps;
    }

    @Override
    public void updateParameters(Object entity) {
        Bairro other        = (Bairro) entity;
        this.nome           =   other.nome;
        this.cidade         =   other.cidade;
        this.logradouros    =   other.logradouros;
        this.ceps           =   other.ceps;
    }
    
    
}/* FIM -> Bairro() */
