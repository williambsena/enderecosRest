package com.enderecorest.service.impl;

import com.enderecorest.dao.DAO;
import com.enderecorest.model.Bairro;
import com.enderecorest.service.BairroService;
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
@Path("/bairro")
public class BairroServiceImpl extends GenericCRUDRestService<Bairro> implements BairroService {

    public BairroServiceImpl(Class<Bairro> entityClass) {
        super(entityClass);
    }
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(BairroServiceImpl.class.getName());

    
    @Override
    public GenericEntity listToGenericEntity(List<Bairro> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAO getDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
