package com.nttdata.creditmicroservice.aplicacion.api;

import com.nttdata.creditmicroservice.dominio.entidades.CreditDTO;
import com.nttdata.creditmicroservice.dominio.servicios.CreditServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("credits")
public class CreditController {

  @Autowired
  private CreditServiceImpl creditService;

  @GetMapping
  public Flux<CreditDTO> getCredits(){
    return creditService.getAll();
  }

  @GetMapping("/{idCredit}")
  public Mono<CreditDTO> getCredit(@PathVariable String idCredit){
    return creditService.getCredit(idCredit);
  }

  @PostMapping
  public Mono<CreditDTO> saveCredit(@RequestBody Mono<CreditDTO> creditDTOMono){
    return creditService.save(creditDTOMono);
  }

  @PutMapping("/{idCredit}")
  public Mono<CreditDTO> updateCredit(@RequestBody Mono<CreditDTO> creditDTOMono, @PathVariable String idCredit){
    return creditService.updateCredit(creditDTOMono,idCredit);
  }

  @DeleteMapping("/{idCredit}")
  public Mono<Void> deleteCredit(@PathVariable String idCredit){
    return creditService.deleteCredit(idCredit);
  }
}
