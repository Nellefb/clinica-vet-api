package com.ellenbarros.clinica_vet_api.dto;

import com.ellenbarros.clinica_vet_api.domain.Responsavel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonPropertyOrder({"id", "nome", "email", "telefone"})
public class ResponsavelDTO implements Serializable {

    private String id;
    private String nome;
    private String email;
    private String telefone;

    public ResponsavelDTO() {
    }

    public ResponsavelDTO(Responsavel obj) {
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
        telefone = obj.getTelefone();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
