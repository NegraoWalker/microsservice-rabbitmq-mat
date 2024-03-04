package com.walker.microsservicerabbitmqmat.mapper;

import com.walker.microsservicerabbitmqmat.dto.PropostaRequestDto;
import com.walker.microsservicerabbitmqmat.dto.PropostaResponseDto;
import com.walker.microsservicerabbitmqmat.entity.Proposta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PropostaMapper {

    PropostaMapper PROPOSTA_MAPPER = Mappers.getMapper(PropostaMapper.class); //Criação de um método static para interagir com a interface criada de conversão

    /* O nome do método foi escolhido para que o Spring Boot e o MapStruct entenda e implemente o método de forma automática*/
    @Mapping(target = "usuario.nome", source = "nome")
    @Mapping(target = "usuario.sobrenome",source = "sobrenome")
    @Mapping(target = "usuario.cpf",source = "cpf")
    @Mapping(target = "usuario.telefone",source = "telefone")
    @Mapping(target = "usuario.renda",source = "renda")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "aprovada", ignore = true)
    @Mapping(target = "integrada", ignore = true)
    @Mapping(target = "observacao", ignore = true)
    Proposta convertDtoToProposta(PropostaRequestDto propostaRequestDto);

    @Mapping(target = "nome", source = "usuario.nome")
    @Mapping(target = "sobrenome", source = "usuario.sobrenome")
    @Mapping(target = "telefone", source = "usuario.telefone")
    @Mapping(target = "cpf", source = "usuario.cpf")
    @Mapping(target = "renda", source = "usuario.renda")
    PropostaResponseDto convertEntityToDto(Proposta proposta);
}
