/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao.impl;

import com.enderecorest.dao.CidadeDAO;
import com.enderecorest.dao.GenericDAO;
import com.enderecorest.model.Cidade;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Willi
 */
@ApplicationScoped
public class CidadeDAOImpl extends GenericDAO<Cidade, Long> implements CidadeDAO {

    public CidadeDAOImpl(Class<Cidade> entityClass) {
        super(entityClass);
    }
    private static final Logger LOG = Logger.getLogger(CidadeDAOImpl.class.getName());

    public static Logger getLOG() {
        return LOG;
    }

    @Override
    public org.slf4j.Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cidade> findByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cidade> findByCep(Integer cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
