package com.nttdada.accountmicroservice.infraestructura.repositorios;

import com.nttdada.accountmicroservice.dominio.entidades.AccountDTO;
import com.nttdada.accountmicroservice.infraestructura.crud.AccountCrudRepository;
import com.nttdada.accountmicroservice.infraestructura.interfaces.AccountRepository;
import com.nttdada.accountmicroservice.infraestructura.mapeo.Mapper;
import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class AccountRepositoryR implements AccountRepository {

    @Autowired
    private AccountCrudRepository  accountCrudRepository;

    @Override
    public Flux<AccountDTO> getAll() {
        return accountCrudRepository.findAll().map(Mapper::entityToDto);
    }

    @Override
    public Mono<AccountDTO> save(Mono<AccountDTO> accountDTOMono) {
        return accountDTOMono.map(Mapper::dtoToEntity)
                .flatMap(accountCrudRepository::save)
                .map(Mapper::entityToDto);
    }

    @Override
    public Mono<AccountDTO> getAccount(String id) {
        return accountCrudRepository.findById(id).map(Mapper::entityToDto);
    }

    @Override
    public Mono<AccountDTO> updateAccount(Mono<AccountDTO> accountDTOMono, String idAccount) {
        return accountCrudRepository.findById(idAccount)
                .flatMap(a->accountDTOMono.map(Mapper::dtoToEntity)
                        .doOnNext(e->e.setId(idAccount)))
                .flatMap(accountCrudRepository::save)
                .map(Mapper::entityToDto);
    }

    @Override
    public Mono<Void> deleteAccount(String idAccount) {
        return accountCrudRepository.deleteById(idAccount);
    }

    @Override
    public Mono<AccountDTO> existsById(String id) {
        return null;
    }
}
