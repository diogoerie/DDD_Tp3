package com.example.petfriends.services;

import com.example.petfriends.models.ConsultaAgregado;
import com.example.petfriends.repositories.ConsultaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCommandService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Transactional
    public void criarConsulta(Long idDaConsulta, String tipoDeServico, int quantidade) {
        ConsultaAgregado consulta = new ConsultaAgregado();
        consulta.setIdDaConsulta(idDaConsulta);
        consulta.setTipoDeServico(tipoDeServico);
        consulta.setQuantidade(quantidade);

        consultaRepository.save(consulta);
    }
}
