package com.enderecorest.dao.impl;

import com.enderecorest.dao.GenericDAO;
import com.enderecorest.dao.PessoaDAO;
import com.enderecorest.model.Logradouro;
import com.enderecorest.model.Pessoa;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;


/**
 *
 * @author Williamsena
 */
@ApplicationScoped
public class PessoaDAOImpl extends GenericDAO<Pessoa, Long> implements PessoaDAO {

    public PessoaDAOImpl(Class<Pessoa> entityClass) {
        super(entityClass);
    }
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(PessoaDAOImpl.class.getName());
    
    
    
    @Override
    public Logger getLogger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findByCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findByrg(String rg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findByNomeCompleto(String nome, String sobrenome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findByLogradouro(Logradouro logradouro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
