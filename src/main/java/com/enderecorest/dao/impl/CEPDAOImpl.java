/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao.impl;


import com.enderecorest.dao.CEPDAO;
import com.enderecorest.dao.GenericDAO;
import com.enderecorest.model.CEP;
import com.enderecorest.model.Cidade;
import com.enderecorest.model.Logradouro;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
/**
 *
 * @author Willi
 */
@ApplicationScoped
public class CEPDAOImpl extends GenericDAO<CEP, Long> implements CEPDAO {
    
    public CEPDAOImpl(Class<CEP> entityClass) {
        super(entityClass);
    }

    
    
    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CEP> findByCep(Integer CEP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CEP> findByCidade(Cidade cidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CEP> findByLogradouro(Logradouro logradouro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
