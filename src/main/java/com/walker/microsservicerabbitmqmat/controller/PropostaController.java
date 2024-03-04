package com.walker.microsservicerabbitmqmat.controller;

import com.walker.microsservicerabbitmqmat.dto.PropostaRequestDto;
import com.walker.microsservicerabbitmqmat.dto.PropostaResponseDto;
import com.walker.microsservicerabbitmqmat.service.PropostaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "api/v1/proposta")
public class PropostaController {

    private PropostaService propostaService; //Dependência do service adicionada

    public PropostaController(PropostaService propostaService) { //Injeção de dependência via construtor
        this.propostaService = propostaService;
    } 

    @PostMapping
    public ResponseEntity<PropostaResponseDto> criarProposta(@RequestBody PropostaRequestDto propostaRequestDto){
        PropostaResponseDto responseDto = propostaService.salvarProposta(propostaRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}
