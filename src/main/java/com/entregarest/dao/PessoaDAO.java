package com.enderecorest.dao;

import com.enderecorest.model.Logradouro;
import com.enderecorest.model.Pessoa;
import java.util.List;


/**
 *
 * @author Williamsena
 */

public interface PessoaDAO extends DAO<Pessoa, Long> {

    
    List<Pessoa> findByCpf(String cpf);
    List<Pessoa> findByrg(String rg);
    List<Pessoa> findByNome(String nome);
    List<Pessoa> findByNomeCompleto(String nome , String sobrenome);
    List<Pessoa> findByLogradouro(Logradouro logradouro);
    
    
    
}
