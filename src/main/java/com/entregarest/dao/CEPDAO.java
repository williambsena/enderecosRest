/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.model.CEP;
import com.enderecorest.model.Cidade;
import com.enderecorest.model.Logradouro;
import java.util.List;
import javax.persistence.NamedQuery;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Willi
 */
public interface CEPDAO extends DAO<CEP, Long> {
    
    List<CEP> findByCep(Integer CEP);
    List<CEP> findByCidade(Cidade cidade);
    List<CEP> findByLogradouro(Logradouro logradouro);
    
    
    
}// CEPDAO