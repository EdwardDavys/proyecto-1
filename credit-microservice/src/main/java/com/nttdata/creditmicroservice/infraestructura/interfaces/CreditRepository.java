package com.nttdata.creditmicroservice.infraestructura.interfaces;

import com.nttdata.creditmicroservice.dominio.entidades.CreditDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository {

  Flux<CreditDTO> getAll();
  Mono<CreditDTO> save(Mono<CreditDTO> creditDTOMono);
  Mono<CreditDTO> getCredit(String idCredit);
  Mono<CreditDTO> updateCredit(Mono<CreditDTO>creditDTOMono, String idCredit);
  Mono<Void> deleteCredit(String idCredit);


}
