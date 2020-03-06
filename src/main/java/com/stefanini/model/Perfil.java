package com.stefanini.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author dernivalliandro
 */
@Entity
@Data
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {

    /**
     * Serializacao da Classe
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID da Tabela
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_SEQ_PERFIL", nullable = false, columnDefinition = "int")
    private Integer idPerfil;
    /**
     * Nome do Perfil
     */
    @NotNull
    @Column(name = "NO_PERFIL", nullable = false, columnDefinition = "varchar(255)")
    private String nomePerfil;
    /**
     * Descrição do Perfil
     */
    @NotNull
    @Column(name = "DS_PERFIL", nullable = false, columnDefinition = "varchar(1000)")
    private String descPerfil;
    /**
     * Hora de Criacao
     */
    @NotNull
    @Column(name = "DT_HORA_INCLUSAO", nullable = false, columnDefinition = "timestamp")
    private LocalDateTime horaInclusao;
    /**
     * Hora da Alteracao
     */
    @Column(name = "DT_HORA_ALTERACAO", nullable = true, columnDefinition = "timestamp")
    private LocalDateTime horaAlteracao;
}
