/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enderecorest.dao;

import com.enderecorest.model.Logradouro;
import java.util.List;

/**
 *
 * @author Willi
 */
public interface LogradouroDAO extends DAO<Logradouro, Long> {
    List<Logradouro> findByLogradouro(String sLogradouro);
    List<Logradouro> findByCep(Integer CEP);
}//FIM -> LogradouroDAO
