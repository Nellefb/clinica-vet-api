package com.ellenbarros.clinica_vet_api.resources;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import com.ellenbarros.clinica_vet_api.services.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/responsaveis")
public class ResponsavelResource {

    @Autowired
    private ResponsavelService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Responsavel>> findAll() {
        List<Responsavel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
