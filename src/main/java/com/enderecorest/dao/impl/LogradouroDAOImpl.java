package com.enderecorest.dao.impl;

import com.enderecorest.dao.GenericDAO;
import com.enderecorest.dao.LogradouroDAO;
import com.enderecorest.model.Logradouro;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;


/**
 *
 * @author Williamsena
 */
@ApplicationScoped
public class LogradouroDAOImpl extends GenericDAO<Logradouro, Long> implements LogradouroDAO {

    
    public LogradouroDAOImpl(Class<Logradouro> entityClass) {
        super(entityClass);
    }
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(LogradouroDAOImpl.class.getName());

    public static java.util.logging.Logger getLOG() {
        return LOG;
    }

    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Logradouro> findByLogradouro(String sLogradouro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Logradouro> findByCep(Integer CEP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
