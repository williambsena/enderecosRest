/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.model.Cidade;
import com.enderecorest.model.Estado;
import java.util.List;
import javax.persistence.NamedQuery;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Willi
 */
public interface CidadeDAO extends DAO<Cidade, Long> {
    
    List<Cidade> findByNome(String nome);
    List<Cidade> findByCep(Integer cpf);
    
    
}// CidadeDAO