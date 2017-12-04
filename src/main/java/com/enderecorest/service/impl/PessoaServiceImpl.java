package com.enderecorest.service.impl;

import com.enderecorest.dao.DAO;
import com.enderecorest.dao.PessoaDAO;
import com.enderecorest.model.Pessoa;
import com.enderecorest.service.GenericCRUDRestService;
import com.enderecorest.service.PessoaService;
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
@Path("/pessoa")
public class PessoaServiceImpl extends GenericCRUDRestService<Pessoa> implements PessoaService {
    
    private static final Logger LOG  = LoggerFactory.getLogger(PessoaServiceImpl.class);
    
    @Inject
    private PessoaDAO pessoaDAO;

    public PessoaServiceImpl(Class<Pessoa> entityClass) {
        super(entityClass);
    }
    
    @Override
    public GenericEntity listToGenericEntity(List<Pessoa> list) {
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
