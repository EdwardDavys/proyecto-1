package com.nttdata.typeClientmicroservice.infraestructura.crud;

import com.nttdata.typeClientmicroservice.infraestructura.model.document.TypeClient;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TypeClientCrudRepository extends ReactiveCrudRepository<TypeClient,String> {
}
