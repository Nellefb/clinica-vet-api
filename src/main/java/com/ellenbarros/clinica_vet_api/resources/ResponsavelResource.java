package com.ellenbarros.clinica_vet_api.resources;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/responsaveis")
public class ResponsavelResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Responsavel>> findAll() {
        Responsavel resp1 = new Responsavel("1", "Maria Ferreira", "maria@gmail.com", "11999999999");
        Responsavel resp2 = new Responsavel("2", "Pedro Silva", "pedro@gmail.com", "11999999999");
        List<Responsavel> list = new ArrayList<>();
        list.addAll(Arrays.asList(resp1, resp2));
        return ResponseEntity.ok().body(list);

    }
}
