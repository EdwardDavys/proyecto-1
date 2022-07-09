package com.nttdada.accountmicroservice.dominio.interfaces;

import com.nttdada.accountmicroservice.dominio.entidades.AccountDTO;
import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {

    Flux<AccountDTO> getAll();

    //Flux<AccountDTO> findByClientId(String idClient);
    Mono<AccountDTO> save(Mono<AccountDTO> account);

    Mono<AccountDTO> updateAccount(Mono<AccountDTO> accountDTOMono, String idAccounts);
    Mono<AccountDTO> getAccount(String id);
    Mono<AccountDTO> existsById(String id);
}
