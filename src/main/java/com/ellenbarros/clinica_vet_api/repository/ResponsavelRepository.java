package com.ellenbarros.clinica_vet_api.repository;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends MongoRepository<Responsavel, String> {
}
