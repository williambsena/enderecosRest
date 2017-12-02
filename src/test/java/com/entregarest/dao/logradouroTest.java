/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.dao.impl.LogradouroDAOImpl;
import com.enderecorest.model.Bairro;
import com.enderecorest.model.CEP;
import com.enderecorest.model.Logradouro;
import com.enderecorest.model.Pessoa;
import com.enderecorest.model.TpLogradouro;
import java.util.Set;
import javax.inject.Inject;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;

/**
 *
 * @author Willi
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(LogradouroDAOImpl.class)
public class logradouroTest {
    @Inject 
    private Bairro bairro;
    
    @Inject 
    private CEP cep;
    
    @Inject
    private Set<Pessoa> moradores;
    
    private static Logradouro PRIMEIRO;
    static{
          PRIMEIRO = new Logradouro("Arthur Monfredinho", "418", null, TpLogradouro.R, null , null, null);
    }//ARTHURMONFREDINHO
    
    private static Logradouro SEGUNDO;
    static{
          SEGUNDO = new Logradouro("Irene Sanches Fabeni", "184", "Casa nos fundos." , TpLogradouro.R, null , null, null);
    }//IRENEFABENI
}
