package com.nttdada.accountmicroservice.infraestructura.interfaces;

import com.nttdada.accountmicroservice.dominio.entidades.AccountDTO;
import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    Flux<AccountDTO> getAll();
    Mono<AccountDTO> save(Mono<AccountDTO> accountDTOMono);
    Mono<AccountDTO> getAccount(String idAccount);

    Mono<AccountDTO> updateAccount(Mono<AccountDTO> accountDTOMono, String idAccount);

    Mono<Void> deleteAccount(String idAccount);
    Mono<AccountDTO> existsById(String id);
}
