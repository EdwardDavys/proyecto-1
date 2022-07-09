package com.nttdata.typeClientmicroservice.infraestructura.repositorios;

import com.nttdata.typeClientmicroservice.dominio.entidades.TypeClienDTO;
import com.nttdata.typeClientmicroservice.infraestructura.crud.TypeClientCrudRepository;
import com.nttdata.typeClientmicroservice.infraestructura.interfaces.TypeClientRepository;
import com.nttdata.typeClientmicroservice.infraestructura.mapeo.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class TypeClientRepositoryR implements TypeClientRepository {

    @Autowired
    private TypeClientCrudRepository typeClientCrudRepository;

    @Override
    public Flux<TypeClienDTO> getAll() {
        return typeClientCrudRepository.findAll().map(Mapper::entityToDto);
    }

    @Override
    public Mono<TypeClienDTO> save(Mono<TypeClienDTO> typeClienDTOMono) {
        return typeClienDTOMono.map(Mapper::dtoToEntity)
                .flatMap(typeClientCrudRepository::save)
                .map(Mapper::entityToDto);
    }

    @Override
    public Mono<TypeClienDTO> getTypeClient(String idTypeClient) {
        return typeClientCrudRepository.findById(idTypeClient).map(Mapper::entityToDto);
    }

    @Override
    public Mono<TypeClienDTO> updateTypeClient(Mono<TypeClienDTO> typeClienDTOMono, String idTypeClient) {
        return typeClientCrudRepository.findById(idTypeClient)
                .flatMap(t->typeClienDTOMono.map(Mapper::dtoToEntity)
                        .doOnNext(e->e.setId(idTypeClient)))
                .flatMap(typeClientCrudRepository::save)
                .map(Mapper::entityToDto);
    }

    @Override
    public Mono<Void> deleteTypeClient(String idTypeClient) {
        return typeClientCrudRepository.deleteById(idTypeClient);
    }
}
