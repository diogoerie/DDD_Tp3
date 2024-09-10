package com.example.petfriends.controllers;

import com.example.petfriends.commands.CriarConsultaCommand;
import com.example.petfriends.services.ConsultaCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendar-consulta")
public class ConsultaCommandController {

    @Autowired
    private ConsultaCommandService consultaCommandService;

    @PostMapping
    public ResponseEntity<Void> criarConsulta(@RequestBody CriarConsultaCommand comando) {
        consultaCommandService.criarConsulta(comando.getIdConsulta(), comando.getTipoDeServico(), comando.getQuantidade());
        return ResponseEntity.ok().build();
    }
}