package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MONITOR")

public class Monitor {
    @Column(name= "ID_MONITOR")//configurando o nome do campo sql
    @Id //Define a chave primária (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_FOTO")
    private String foto;
    @Column(name = "TX_WHATSAPP")
    private String whatsapp;
    @Column(name = "TX_EMAIL")
    private String email;
    @Column(name = "TX_CONTEUDO")
    private String conteudo;

}
