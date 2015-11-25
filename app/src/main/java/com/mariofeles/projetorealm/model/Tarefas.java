package com.mariofeles.projetorealm.model;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by Mario Feles dos Santos Jr. on 25,Novembro,2015
 * mario_feles@live.com
 * Projeto ProjetoRealm
 */
public class Tarefas extends RealmObject {

    public static final String ID = "com.mariofeles.projetorealm.model.RealmObject.ID";

    private Long id;
    private String descricao;
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
