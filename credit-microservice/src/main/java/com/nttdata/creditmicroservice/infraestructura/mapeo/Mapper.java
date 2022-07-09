package com.nttdata.creditmicroservice.infraestructura.mapeo;

import com.nttdata.creditmicroservice.dominio.entidades.CreditDTO;
import com.nttdata.creditmicroservice.infraestructura.model.Credit;
import org.springframework.beans.BeanUtils;

public class Mapper {


  public static CreditDTO entityToDto(Credit credit){
    CreditDTO creditDTO = new CreditDTO();
    BeanUtils.copyProperties(credit,creditDTO);
    return creditDTO;
  }
  public static Credit dtoToEntity(CreditDTO creditDTO){
    Credit credit = new Credit();
    BeanUtils.copyProperties(creditDTO,credit);
    return credit;
  }
}
