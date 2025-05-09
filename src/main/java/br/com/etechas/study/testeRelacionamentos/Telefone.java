package br.com.etechas.study.testeRelacionamentos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="telefone")
public class Telefone {
    @Id
    private int id;
    private String numero;
    private String ddd;

    @OneToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;
}
