package br.com.etechas.study.testeRelacionamentos;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "propietaio")
public class Propietario {
    @Id
    private int id;

    private String nome;
}
