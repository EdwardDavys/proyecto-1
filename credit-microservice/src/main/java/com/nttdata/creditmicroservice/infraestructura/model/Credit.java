package com.nttdata.creditmicroservice.infraestructura.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "credits")
public class Credit {

  @Id
  private String idCredit;
  private String creditCarNumber;
  private double Commision;
  private double yearcommision;
  private String idClient;

}
