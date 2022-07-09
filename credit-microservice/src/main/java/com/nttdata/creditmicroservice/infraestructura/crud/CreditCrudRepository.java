package com.nttdata.creditmicroservice.infraestructura.crud;

import com.nttdata.creditmicroservice.infraestructura.model.Credit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CreditCrudRepository extends ReactiveCrudRepository<Credit, String> {
}
