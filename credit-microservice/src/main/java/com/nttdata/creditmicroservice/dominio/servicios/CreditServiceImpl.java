package com.nttdata.creditmicroservice.dominio.servicios;

import com.nttdata.creditmicroservice.dominio.entidades.CreditDTO;
import com.nttdata.creditmicroservice.dominio.interfaces.CreditService;
import com.nttdata.creditmicroservice.infraestructura.repositorios.CreditRepositoryR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CreditServiceImpl implements CreditService {
  @Autowired
  private CreditRepositoryR creditRepositoryR;

  @Override
  public Flux<CreditDTO> getAll() {
    return creditRepositoryR.getAll();
  }

  @Override
  public Mono<CreditDTO> save(Mono<CreditDTO> creditDTOMono) {
    return creditRepositoryR.save(creditDTOMono);
  }

  @Override
  public Mono<CreditDTO> getCredit(String idCredit) {
    return creditRepositoryR.getCredit(idCredit);
  }

  @Override
  public Mono<CreditDTO> existsById(String idCredit) {
    return null;
  }

  @Override
  public Mono<CreditDTO> updateCredit(Mono<CreditDTO> creditDTOMono, String idCredit) {
    return creditRepositoryR.updateCredit(creditDTOMono,idCredit);
  }

  @Override
  public Mono<Void> deleteCredit(String id) {
    return creditRepositoryR.deleteCredit(id);
  }
}
