package com.enderecorest.service.impl;

import com.enderecorest.dao.DAO;
import com.enderecorest.dao.LogradouroDAO;
import com.enderecorest.model.Logradouro;
import com.enderecorest.service.GenericCRUDRestService;
import com.enderecorest.service.LogradouroService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Williamsena
 */
@ManagedBean
@Path("/logradouro")
public class LogradouroServiceImpl extends GenericCRUDRestService<Logradouro> implements LogradouroService {
    
    private static final Logger LOG  = LoggerFactory.getLogger(LogradouroServiceImpl.class);
    
    @Inject
    private LogradouroDAO LogradouroDAO;

    public LogradouroServiceImpl(Class<Logradouro> entityClass) {
        super(entityClass);
    }
    
    @Override
    public GenericEntity listToGenericEntity(List<Logradouro> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAO getDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
