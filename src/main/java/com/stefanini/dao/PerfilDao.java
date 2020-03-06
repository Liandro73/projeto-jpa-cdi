package com.stefanini.dao;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Perfil;

/**
 * @author dernivalliandro
 */
public class PerfilDao extends GenericDao<Perfil, Integer> {

    public PerfilDao() {
        super(Perfil.class);
    }

}
