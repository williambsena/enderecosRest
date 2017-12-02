package com.enderecorest.service.impl;

import com.enderecorest.dao.DAO;
import com.enderecorest.dao.CidadeDAO;
import com.enderecorest.model.Cidade;
import com.enderecorest.service.GenericCRUDRestService;
import com.enderecorest.service.CidadeService;
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
@Path("/Cidade")
public class CidadeServiceImpl extends GenericCRUDRestService<Cidade> implements CidadeService {
    
    private static final Logger LOG  = LoggerFactory.getLogger(CidadeServiceImpl.class);
    
    @Inject
    private CidadeDAO CidadeDAO;

    public CidadeServiceImpl(Class<Cidade> entityClass) {
        super(entityClass);
    }
    
    @Override
    public GenericEntity listToGenericEntity(List<Cidade> list) {
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
