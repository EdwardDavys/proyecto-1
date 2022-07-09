package com.nttdada.accountmicroservice.aplicacion.api;

import com.nttdada.accountmicroservice.dominio.entidades.AccountDTO;
import com.nttdada.accountmicroservice.dominio.servicios.AccountServiceImpl;
import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    @GetMapping
    public Flux<AccountDTO> getAll(){
        return accountService.getAll();
    }

    @PostMapping
    public Mono<AccountDTO > registrer(@RequestBody Mono<AccountDTO> account){
        return accountService.save(account);
    }

   /* @GetMapping("/byClient/{idClient}")
    public Flux<AccountDTO> getByClientId(@PathVariable("idclient") String idClient){
        Flux<Account> accountFlux = accountService.findByClientId(idClient);
        return accountFlux;
    }*/

    @PutMapping
    public Mono<AccountDTO> updateAccounts(@RequestBody Mono<AccountDTO> accountDTOMono, @PathVariable String idAccounts){
        return accountService.updateAccount(accountDTOMono,idAccounts);
    }
}
