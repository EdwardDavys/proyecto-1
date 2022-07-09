package com.nttdata.typeClientmicroservice.infraestructura.model.document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "typeclients")
public class TypeClient {

    @Id
    private String id;

    private String nameTypeClient;

}
