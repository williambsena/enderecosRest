package com.enderecorest.model;

import java.util.Set;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Willi
 */
public enum Estado {
    AC("Acre",Pais.BRA),
    AL("Alagoas",Pais.BRA),
    AP("Amapá",Pais.BRA),
    AM("Amazonas",Pais.BRA),
    BA("Bahia",Pais.BRA),
    CE("Ceará",Pais.BRA),
    DF("Distrito Federal",Pais.BRA),
    ES("Espírito Santo",Pais.BRA),
    GO("Goiás",Pais.BRA),
    MA("Maranhão",Pais.BRA),
    MT("Mato Grosso",Pais.BRA),
    MS("Mato Grosso do Sul",Pais.BRA),
    MG("Minas Gerais",Pais.BRA),
    PA("Pará",Pais.BRA),
    PB("Paraíba",Pais.BRA),
    PR("Paraná",Pais.BRA),
    PE("Pernambuco",Pais.BRA),
    PI("Piauí",Pais.BRA),
    RJ("Rio de Janeiro",Pais.BRA),
    RN("Rio Grande do Norte",Pais.BRA),
    RS("Rio Grande do Sul",Pais.BRA),
    RO("Rondônia",Pais.BRA),
    RR("Roraima",Pais.BRA),
    SC("Santa Catarina",Pais.BRA),
    SP("São Paulo",Pais.BRA),
    SE("Sergipe ",Pais.BRA),
    TO("Tocantins",Pais.BRA);
    private final String sEstado;
    
    @ManyToOne
    private Pais pais;

    private Estado(String sEstado, Pais pais){
        this.sEstado = sEstado;
        this.pais    = pais;
    }//FIM -> Estado()
    
    public String getEstado(){
        return sEstado;
    }// FIM -> getEstado()

    
    
    @OneToMany(mappedBy = "evento")
    private Set<Cidade> cidades;

    
}//FIM -> Estado
