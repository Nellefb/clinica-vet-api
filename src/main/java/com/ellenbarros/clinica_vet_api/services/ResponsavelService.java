package com.ellenbarros.clinica_vet_api.services;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import com.ellenbarros.clinica_vet_api.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository repository;

    public List<Responsavel> findAll() {
        return repository.findAll();
    }
}
