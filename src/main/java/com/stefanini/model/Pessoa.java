package com.stefanini.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author joaopedromilhome
 */
@Entity
@Data
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable {

    /**
     * Serializacao da Classe
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID da Tabela
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_SEQ_PESSOA", columnDefinition = "bigint")
    private Long idPessoa;
    /**
     * Nome da pessoa
     */
    @NotNull
    @Column(name = "NO_NOME", nullable = false, columnDefinition = "varchar(400)")
    private String nome;
    /**
     * Email da Pessoa
     */
    @NotNull
    @Column(name = "DS_EMAIL", nullable = false, columnDefinition = "varchar(200)")
    private String email;
    /**
     * Data de Nascimento
     */
    @NotNull
    @Column(name = "DT_NASCIMENTO", nullable = false, columnDefinition = "date")
    private LocalDate dataNascimento;
    /**
     * Situacao da Pessoa
     */
    @NotNull
    @Column(name = "ST_PESSOA", nullable = false, columnDefinition = "boolean")
    private Boolean situacao;

    @OneToMany(mappedBy = "pessoa")
    private Set<Endereco> enderecos;

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @OneToMany
    @JoinTable(name = "TB_PESSOA_PERFIL", joinColumns = @JoinColumn(name = "CO_SEQ_PESSOA"),
                inverseJoinColumns = @JoinColumn(name = "CO_SEQ_PERFIL"))
    private List<Perfil> perfis;

    public List<Perfil> getPerfis() { return perfis; }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }

}