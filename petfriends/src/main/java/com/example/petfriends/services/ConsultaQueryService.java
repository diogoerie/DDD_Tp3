package com.example.petfriends.services;

import com.example.petfriends.models.ConsultaAgregado;
import com.example.petfriends.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaQueryService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public ConsultaAgregado obterConsultaPorId(Long idConsulta) {
        Optional<ConsultaAgregado> consultaOptional = consultaRepository.findById(idConsulta);
        return consultaOptional.orElse(null);
    }

    public List<ConsultaAgregado> listarTodasConsultas() {
        return consultaRepository.findAll();
    }
}
