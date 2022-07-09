package com.nttdada.accountmicroservice.dominio.servicios;

import com.nttdada.accountmicroservice.dominio.entidades.AccountDTO;
import com.nttdada.accountmicroservice.dominio.interfaces.AccountService;
import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import com.nttdada.accountmicroservice.infraestructura.repositorios.AccountRepositoryR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepositoryR  accountRepositoryR;

    @Override
    public Flux<AccountDTO> getAll() {
        return accountRepositoryR.getAll();
    }

   /* @Override
    public Flux<AccountDTO> findByClientId(String idClient) {
        return accountRepositoryR.getAccount(idClient);
    }
*/
    @Override
    public Mono<AccountDTO> save(Mono<AccountDTO> account) {
        return accountRepositoryR.save(account);
    }

  @Override
  public Mono<AccountDTO> updateAccount(Mono<AccountDTO> accountDTOMono, String idAccounts) {
    return accountRepositoryR.updateAccount(accountDTOMono,idAccounts);
  }

  @Override
    public Mono<AccountDTO> getAccount(String id) {
        return accountRepositoryR.getAccount(id);
    }

    @Override
    public Mono<AccountDTO> existsById(String id) {
        return accountRepositoryR.existsById(id);
    }
}
