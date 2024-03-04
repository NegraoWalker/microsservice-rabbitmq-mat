package com.walker.microsservicerabbitmqmat.service;

import com.walker.microsservicerabbitmqmat.dto.PropostaRequestDto;
import com.walker.microsservicerabbitmqmat.dto.PropostaResponseDto;
import com.walker.microsservicerabbitmqmat.entity.Proposta;
import com.walker.microsservicerabbitmqmat.mapper.PropostaMapper;
import com.walker.microsservicerabbitmqmat.repository.PropostaRepository;
import org.springframework.stereotype.Service;

@Service
public class PropostaService {

    private PropostaRepository propostaRepository; //Dependência do repository adicionada

    public PropostaService(PropostaRepository propostaRepository) { //Injeção de dependências via construtor
        this.propostaRepository = propostaRepository;
    }

    public PropostaResponseDto salvarProposta(PropostaRequestDto propostaRequestDto){
        Proposta proposta = PropostaMapper.PROPOSTA_MAPPER.convertDtoToProposta(propostaRequestDto);
        propostaRepository.save(proposta);
        return PropostaMapper.PROPOSTA_MAPPER.convertEntityToDto(proposta);
    }
}
