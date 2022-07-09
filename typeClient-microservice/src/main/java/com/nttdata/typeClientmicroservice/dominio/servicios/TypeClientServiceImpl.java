package com.nttdata.typeClientmicroservice.dominio.servicios;

import com.nttdata.typeClientmicroservice.dominio.entidades.TypeClienDTO;
import com.nttdata.typeClientmicroservice.dominio.interfaces.TypeClientService;
import com.nttdata.typeClientmicroservice.infraestructura.repositorios.TypeClientRepositoryR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeClientServiceImpl implements TypeClientService {

    @Autowired
   private TypeClientRepositoryR typeClientRepositoryR;

    @Override
    public Flux<TypeClienDTO> getAll() {
        return typeClientRepositoryR.getAll();
    }

    @Override
    public Mono<TypeClienDTO> save(Mono<TypeClienDTO> typeClienDTOMono) {
        return typeClientRepositoryR.save(typeClienDTOMono);
    }

    @Override
    public Mono<TypeClienDTO> getTypeClient(String idTypeClient) {
        return typeClientRepositoryR.getTypeClient(idTypeClient);
    }

    @Override
    public Mono<TypeClienDTO> updateTypeCliente(Mono<TypeClienDTO> typeClienDTOMono, String idTypeClient) {
        return typeClientRepositoryR.updateTypeClient(typeClienDTOMono,idTypeClient);
    }

    @Override
    public Mono<Void> deleteTypeClient(String idTypeClient) {
        return typeClientRepositoryR.deleteTypeClient(idTypeClient);
    }
}
