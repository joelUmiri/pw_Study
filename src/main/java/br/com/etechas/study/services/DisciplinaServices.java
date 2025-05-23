package br.com.etechas.study.services;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.repository.DisicplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DisciplinaServices {
    @Autowired
    private DisicplinaRepository repository;

    public List<Disciplina>Listar() {
        return repository.findAll();
    }
}
