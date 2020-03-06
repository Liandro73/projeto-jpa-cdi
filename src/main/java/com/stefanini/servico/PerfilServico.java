package com.stefanini.servico;

import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.util.IGenericService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * @author dernivalliandro
 */
public class PerfilServico implements IGenericService<Perfil, Integer> {

    @Inject
    public PerfilDao perfilDao;

    /**
     * Salvar os dados de um Perfil
     */
    @Override
    public Perfil salvar(@Valid Perfil perfil) {
        return perfilDao.salvar(perfil);
    }

    /**
     * Atualizar o dados de uma Perfil
     */
    @Override
    public Perfil atualizar(@Valid Perfil perfil) {
        return perfilDao.atualizar(perfil);
    }

    /**
     * Remover uma Perfil pelo id
     */
    @Override
    public void remover(Integer id) { perfilDao.remover(id); }

    /**
     * Buscar uma lista de Perfis
     */
    @Override
    public Optional<List<Perfil>> getList() {
        return perfilDao.getList();
    }

    /**
     * Buscar um Perfil pelo ID
     */
    @Override
    public Optional<Perfil> encontrar(Integer id) {
        return perfilDao.encontrar(id);
    }
}
