package com.example.petfriends.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConsultaAgregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDaConsulta;
    private String tipoDeServico;
    private int quantidade;

    public Long getIdDaConsulta() {
        return idDaConsulta;
    }

    public void setIdDaConsulta(Long idDaConsulta) {
        this.idDaConsulta = idDaConsulta;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
