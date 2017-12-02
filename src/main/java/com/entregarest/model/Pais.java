/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.model;

import java.util.Set;
import javax.persistence.OneToMany;

/**
 *
 * @author Willi
 */
public enum Pais {
    
    BRA( "Brasil"   ),
    PAR( "Paraguai" );
    
    private final String nome;
    
    private Pais (String nome){
        this.nome = nome;
    }//fim -> Pais(
    
    public String getPais(){
        return nome;
    }//fim getPais()
    
    @OneToMany(mappedBy = "pais")
    private Set<Estado> estados;

    public Set<Estado> getEstados() {
        return estados;
    }

    public void setEstados(Set<Estado> estados) {
        this.estados = estados;
    }
    
    @Override
    public String toString() {
        return  nome;
    }
    
    
    
}
