package com.nttdata.creditmicroservice.dominio.interfaces;

import com.nttdata.creditmicroservice.dominio.entidades.CreditDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {

  Flux<CreditDTO> getAll();
  Mono<CreditDTO> save(Mono<CreditDTO> creditDTOMono);
  Mono<CreditDTO> getCredit(String idCredit);
  Mono<CreditDTO> existsById(String idCredit);
  Mono<CreditDTO>updateCredit(Mono<CreditDTO> creditDTOMono, String idCredit);
  Mono<Void> deleteCredit(String id);

}
