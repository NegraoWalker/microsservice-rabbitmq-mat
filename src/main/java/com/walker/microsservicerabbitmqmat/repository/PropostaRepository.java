package com.walker.microsservicerabbitmqmat.repository;

import com.walker.microsservicerabbitmqmat.entity.Proposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta,Long> {
}
