package com.stefanini.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author dernivalliandro
 */
@Entity
@Data
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

    /**
     * Serializacao da Classe
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID da Tabela
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_SEQ_ENDERECO", columnDefinition = "int")
    private Integer id;
    /**
     * ID da Tabela "tb_pessoa"
     */
    @NotNull
    @ManyToOne
    @JoinColumn(name = "CO_SEQ_PESSOA", referencedColumnName = "CO_SEQ_PESSOA", nullable = false)
    private Pessoa pessoa;
    /**
     * Nome do Logradouro
     */
    @NotNull
    @Column(name = "DS_LOGRADOURO", nullable = false, columnDefinition = "varchar(150)")
    private String logradouro;
    /**
     * Complemento do Endereco
     */
    @NotNull
    @Column(name = "DS_COMPLEMENTO", nullable = false, columnDefinition = "varchar(150")
    private String complemento;
    /**
     * Nome do Bairro
     */
    @NotNull
    @Column(name = "DS_BAIRRO", nullable = false, columnDefinition = "varchar(250")
    private String bairro;
    /**
     * Nome da Cidade
     */
    @NotNull
    @Column(name = "DS_CIDADE", nullable = false, columnDefinition = "varchar")
    private String cidade;
    /**
     * Codigo UF da Cidade
     */
    @NotNull
    @Column(name = "CO_UF", nullable = false, columnDefinition = "varchar")
    private String uf;
    /**
     * CEP do Endereco
     */
    @NotNull
    @Column(name = "DS_CEP", nullable = false, columnDefinition = "varchar(8)")
    private String cep;
}