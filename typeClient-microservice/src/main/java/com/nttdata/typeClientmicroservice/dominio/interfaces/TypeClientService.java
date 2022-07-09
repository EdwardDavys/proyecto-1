package com.nttdata.typeClientmicroservice.dominio.interfaces;

import com.nttdata.typeClientmicroservice.dominio.entidades.TypeClienDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TypeClientService {

    Flux<TypeClienDTO> getAll();
    Mono<TypeClienDTO> save(Mono<TypeClienDTO> typeClienDTOMono);
    Mono<TypeClienDTO> getTypeClient(String idTypeClient);
    Mono<TypeClienDTO>updateTypeCliente(Mono<TypeClienDTO>typeClienDTOMono, String idTypeClient);
    Mono<Void> deleteTypeClient(String idTypeClient);
}
