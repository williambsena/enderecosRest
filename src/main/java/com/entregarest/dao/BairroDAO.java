/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;
import com.enderecorest.model.Cidade;
import com.enderecorest.model.Bairro;
import java.util.List;
import javax.persistence.NamedQuery;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *
 * @author Willi
 */
public interface BairroDAO extends DAO<Bairro, Long> {
    List<Bairro>findByNome(String nome);
    List<Bairro>findByCidade(Cidade cidade);
    
}//FIM -> BairroDAO
