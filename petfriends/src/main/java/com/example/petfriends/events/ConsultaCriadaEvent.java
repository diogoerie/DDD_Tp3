package com.example.petfriends.events;

public class ConsultaCriadaEvent extends BaseEvent {
    private final String idConsulta;
    private final String tipoDeServico;
    private final int quantidade;

    public ConsultaCriadaEvent(String idConsulta, String tipoDeServico, int quantidade) {
        this.idConsulta = idConsulta;
        this.tipoDeServico = tipoDeServico;
        this.quantidade = quantidade;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String getEventDetails() {
        return "Consulta criada: " + idConsulta + ", Serviço: " + tipoDeServico + ", Quantidade: " + quantidade;
    }
}
