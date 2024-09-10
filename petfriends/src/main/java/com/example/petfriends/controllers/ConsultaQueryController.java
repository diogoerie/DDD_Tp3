package com.example.petfriends.controllers;

import com.example.petfriends.models.ConsultaAgregado;
import com.example.petfriends.services.ConsultaQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mostrar-consultas")
public class ConsultaQueryController {

    @Autowired
    private ConsultaQueryService consultaQueryService;

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaAgregado> obterConsultaPorId(@PathVariable Long id) {
        ConsultaAgregado consulta = consultaQueryService.obterConsultaPorId(id);
        return consulta != null ? ResponseEntity.ok(consulta) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<ConsultaAgregado>> listarTodasConsultas() {
        return ResponseEntity.ok(consultaQueryService.listarTodasConsultas());
    }
}