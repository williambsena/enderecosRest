/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.dao.impl.CidadeDAOImpl;
import com.enderecorest.model.Bairro;
import com.enderecorest.model.CEP;
import com.enderecorest.model.Cidade;
import com.enderecorest.model.Estado;
import com.enderecorest.model.Pais;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import junit.framework.Assert;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Willi
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(CidadeDAOImpl.class)
public class CidadeTest {

    @Inject
    private CidadeDAO cidadeDAO;
    
    @Inject 
    private Estado estado;
    
    private List<CEP> ceps;
    
    private static Cidade JANDAIDOSUL;
    static{
          JANDAIDOSUL = new Cidade("Jandaia do Sul",Estado.PR,Pais.BRA ,null, null );
    }//JANDAIDOSUL
    
    private static Cidade MANDAGUARI;
    static{
          MANDAGUARI = new Cidade("Mandaguari",Estado.PR ,Pais.BRA, null , null );
    }//MANDAGUARI
    
    private static Cidade MARIALVA;
    static{
          MARIALVA = new Cidade("Marialva",Estado.PR ,Pais.BRA , null , null );
    }//MARAILVA
    
    private static Cidade APUCARANA;
    static{
          APUCARANA = new Cidade("Apucarana",Estado.PR ,Pais.BRA , null , null );
    }//MARAILVA
    
    private static Cidade SAOPAULO;
    static{
          SAOPAULO = new Cidade("São Paulo",Estado.SP ,Pais.BRA, null , null );
    }//SAOPAULO
    
    @Test
    public void injectionTest(){
        Assert.assertNotNull(cidadeDAO);
    }
   
}
