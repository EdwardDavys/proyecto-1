package com.nttdata.typeClientmicroservice.infraestructura.interfaces;

import com.nttdata.typeClientmicroservice.dominio.entidades.TypeClienDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TypeClientRepository {

    Flux<TypeClienDTO> getAll();
    Mono<TypeClienDTO> save(Mono<TypeClienDTO> typeClienDTOMono);
    Mono<TypeClienDTO> getTypeClient(String idTypeClient);
    Mono<TypeClienDTO> updateTypeClient(Mono<TypeClienDTO> typeClienDTOMono, String idTypeClient);
    Mono<Void> deleteTypeClient(String idTypeClient);
}
