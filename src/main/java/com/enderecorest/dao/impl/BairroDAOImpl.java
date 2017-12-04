/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao.impl;

import com.enderecorest.dao.BairroDAO;
import com.enderecorest.dao.GenericDAO;
import com.enderecorest.model.Bairro;
import com.enderecorest.model.Cidade;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
/**
 *
 * @author Willi
 */
@ApplicationScoped
public class BairroDAOImpl extends GenericDAO<Bairro, Long> implements BairroDAO {

    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(BairroDAOImpl.class.getName());
    
    
    public BairroDAOImpl(Class<Bairro> entityClass) {
        super(entityClass);
    }

    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bairro> findByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bairro> findByCidade(Cidade cidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
