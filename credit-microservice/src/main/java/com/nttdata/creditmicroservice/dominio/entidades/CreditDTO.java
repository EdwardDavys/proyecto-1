package com.nttdata.creditmicroservice.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditDTO {

  private String idCredit;
  private String creditCarNumber;
  private double Commision;
  private double yearcommision;
  private String idClient;

}
