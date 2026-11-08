package com.ellenbarros.clinica_vet_api.config;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import com.ellenbarros.clinica_vet_api.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ResponsavelRepository responsavelRepository;

    @Override
    public void run(String... args) throws Exception {
        responsavelRepository.deleteAll();

        Responsavel maria = new Responsavel(null, "Maria Barros", "maria@gmail.com", "987667787");
        Responsavel joel = new Responsavel(null, "Joel Santos", "joel@gmail.com", "984345557");
        Responsavel bento = new Responsavel(null, "Bento Silva", "bento@gmail.com", "984444487");

        responsavelRepository.saveAll(Arrays.asList(maria, joel, bento));
    }
}
