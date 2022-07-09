package com.nttdata.creditmicroservice.infraestructura.repositorios;

import com.nttdata.creditmicroservice.dominio.entidades.CreditDTO;
import com.nttdata.creditmicroservice.infraestructura.crud.CreditCrudRepository;
import com.nttdata.creditmicroservice.infraestructura.interfaces.CreditRepository;
import com.nttdata.creditmicroservice.infraestructura.mapeo.Mapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class CreditRepositoryR implements CreditRepository {

  private CreditCrudRepository creditCrudRepository;


  @Override
  public Flux<CreditDTO> getAll() {
    return creditCrudRepository.findAll().map(Mapper::entityToDto);
  }

  @Override
  public Mono<CreditDTO> save(Mono<CreditDTO> creditDTOMono) {
    return creditDTOMono.map(Mapper::dtoToEntity)
        .flatMap(creditCrudRepository::save)
        .map(Mapper::entityToDto);
  }

  @Override
  public Mono<CreditDTO> getCredit(String idCredit) {
    return creditCrudRepository.findById(idCredit).map(Mapper::entityToDto);
  }

  @Override
  public Mono<CreditDTO> updateCredit(Mono<CreditDTO> creditDTOMono, String idCredit) {
    return creditCrudRepository.findById(idCredit)
        .flatMap(c->creditDTOMono.map(Mapper::dtoToEntity)
            .doOnNext(i->i.setIdCredit(idCredit)))
        .flatMap(creditCrudRepository::save)
        .map(Mapper::entityToDto);
  }

  @Override
  public Mono<Void> deleteCredit(String idCredit) {
    return creditCrudRepository.deleteById(idCredit);
  }
}
