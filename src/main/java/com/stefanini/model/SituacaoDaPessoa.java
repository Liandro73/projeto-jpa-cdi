package com.stefanini.model;

public enum SituacaoDaPessoa {

    ATIVO(true), INATIVO(false);

    private Boolean situacao;

    private SituacaoDaPessoa(Boolean situacao) {
        this.situacao = situacao;
    }

    public Boolean getSituacao() {
        return situacao;
    }
}
