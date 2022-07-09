package com.nttdada.accountmicroservice.infraestructura.mapeo;

import com.nttdada.accountmicroservice.dominio.entidades.AccountDTO;
import com.nttdada.accountmicroservice.infraestructura.model.document.Account;
import org.springframework.beans.BeanUtils;

public class Mapper {

    public static AccountDTO entityToDto(Account account){
        AccountDTO accountDTO = new AccountDTO();
        BeanUtils.copyProperties(account,accountDTO);
        return accountDTO;
    }

    public static Account dtoToEntity(AccountDTO accountDTO){
        Account account =new Account();
        BeanUtils.copyProperties(accountDTO,account);
        return account;
    }

}
