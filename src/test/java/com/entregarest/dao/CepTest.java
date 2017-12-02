/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.dao.impl.CEPDAOImpl;
import com.enderecorest.model.CEP;
import com.enderecorest.model.Cidade;
import java.util.List;
import javax.inject.Inject;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;

/**
 *
 * @author Willi
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(CEPDAOImpl.class)
public class CepTest {
    
    @Inject
    private CEPDAO cepDAO;

    public Cidade getCidade() {
        return cidade;
    }
    
    @Inject
    private Cidade cidade;
    
    
    
    private static CEP PRIMEIRO;
    static{
    }//PRIMEIRO
    
     private static CEP SEGUNDO;
    static{
    }//PRIMEIRO
    
    
    
}/* CepTest */
