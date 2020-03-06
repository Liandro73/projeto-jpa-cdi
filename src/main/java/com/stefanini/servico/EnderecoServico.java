package com.stefanini.servico;

import com.stefanini.dao.EnderecoDao;
import com.stefanini.model.Endereco;
import com.stefanini.util.IGenericService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * @author dernivalliandro
 */
public class EnderecoServico implements IGenericService<Endereco, Integer> {

    @Inject
    public EnderecoDao enderecoDao;

    /**
     * Salvar os dados de um Endereco
     */
    @Override
    public Endereco salvar(@Valid Endereco endereco) {
        return enderecoDao.salvar(endereco);
    }

    /**
     * Atualizar o dados de uma Endereco
     */
    @Override
    public Endereco atualizar(@Valid Endereco endereco) {
        return enderecoDao.atualizar(endereco);
    }

    /**
     * Remover uma Endereco pelo id
     */
    @Override
    public void remover(Integer id) { enderecoDao.remover(id); }

    /**
     * Buscar uma lista de Enderecos
     */
    @Override
    public Optional<List<Endereco>> getList() { return enderecoDao.getList(); }

    /**
     * Buscar um Endereco pelo ID
     */
    @Override
    public Optional<Endereco> encontrar(Integer id) { return enderecoDao.encontrar(id); }
}
