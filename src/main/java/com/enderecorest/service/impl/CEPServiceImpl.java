package com.enderecorest.service.impl;

import com.enderecorest.dao.DAO;
import com.enderecorest.model.CEP;
import com.enderecorest.service.CEPService;
import com.enderecorest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;


/**
 *
 * @author Williamsena
 */
@ManagedBean
@Path("/CEP")
public class CEPServiceImpl extends GenericCRUDRestService<CEP> implements CEPService {

    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(CEPServiceImpl.class.getName());
    
    public CEPServiceImpl(Class<CEP> entityClass) {
        super(entityClass);
    }
    
    @Override
    public GenericEntity listToGenericEntity(List<CEP> list) {
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
