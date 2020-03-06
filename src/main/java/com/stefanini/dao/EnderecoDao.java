package com.stefanini.dao;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Endereco;

/**
 * @author dernivalliandro
 */
public class EnderecoDao extends GenericDao<Endereco, Integer> {

    public EnderecoDao() { super(Endereco.class); }

}
