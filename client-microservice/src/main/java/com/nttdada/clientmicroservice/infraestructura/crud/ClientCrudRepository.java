package com.nttdada.clientmicroservice.infraestructura.crud;

import com.nttdada.clientmicroservice.infraestructura.model.document.Client;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ClientCrudRepository extends ReactiveCrudRepository<Client,String> {
}
