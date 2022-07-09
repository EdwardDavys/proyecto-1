package com.nttdada.accountmicroservice.infraestructura.crud;

import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface AccountCrudRepository extends ReactiveCrudRepository<Account,String> {

    Flux<Account> findByClientId(String idClient);
}
