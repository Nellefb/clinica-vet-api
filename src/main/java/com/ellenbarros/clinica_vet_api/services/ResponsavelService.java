package com.ellenbarros.clinica_vet_api.services;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import com.ellenbarros.clinica_vet_api.repository.ResponsavelRepository;
import com.ellenbarros.clinica_vet_api.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository repository;

    public List<Responsavel> findAll() {
        return repository.findAll();
    }

    public Responsavel findById(String id) {
        Optional<Responsavel> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Responsavel nao encontrado"));
    }
}
