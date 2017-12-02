/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.dao.impl.PessoaDAOImpl;
import com.enderecorest.model.Logradouro;
import com.enderecorest.model.Pessoa;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Willi
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(PessoaDAOImpl.class)
public class PessoaTest {
            
    private static Pessoa WILLIAMSENA;
    static{
        WILLIAMSENA = new Pessoa("00000000000","000000000","William","Basseto Sena", "williamsena13@gmail.com",new Date() , null );
    }//static{ WILLIAMSENA }
    
    private static final Pessoa FERNANDOPASCHOALETTO;
    static{
        FERNANDOPASCHOALETTO = new Pessoa("00000000001","000000001","Fernando","Paschoaletto", "paschoaletto@gmail.com",new Date(), null);
    }//static{ FERNANDOPASCHOALETTO }
    
    private static final Pessoa EDUARDOSENA;
    static{
        EDUARDOSENA = new Pessoa("00000000002","000000002","Eduardo","Sena", "email@gmail.com",new Date(), null);
    }//static{ EDUARDOSENA }
    
    @Inject
    private PessoaDAO pessoaDAO;
    
    @Test
    public void injectionTest(){
        Assert.assertNotNull(pessoaDAO);
    }
    @Test
    public void saveTest() {
        List<Pessoa> pessoas = pessoaDAO.findByNome( WILLIAMSENA.getNome());
        if (pessoas == null || pessoas.isEmpty()) {
            pessoaDAO.save(WILLIAMSENA);
        }

        pessoas = pessoaDAO.findByNome(WILLIAMSENA.getNome());
        Assert.assertNotNull(pessoas);
        Assert.assertFalse(pessoas.isEmpty());
        
    }
    
    
}/* PessoaTest() */