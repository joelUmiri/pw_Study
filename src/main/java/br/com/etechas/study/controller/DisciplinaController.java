package br.com.etechas.study.controller;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.services.DisciplinaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaServices service;

    @GetMapping
    public List<Disciplina> listar(){
        return service.Listar();
    }
}
