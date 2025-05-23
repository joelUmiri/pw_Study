package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name= "tbl_disciplina")

public class Disciplina {
    @Column(name= "id_disciplina")//configurando o nome do campo sql
    @Id //Define a chave primária (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tx_nome")
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
