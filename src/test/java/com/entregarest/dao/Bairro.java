/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.dao.impl.BairroDAOImpl;
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
@AdditionalClasses(BairroDAOImpl.class)
public class Bairro {
    
    @Inject
    private BairroDAO bairroDAO;

    
    
}/* CepTest */
