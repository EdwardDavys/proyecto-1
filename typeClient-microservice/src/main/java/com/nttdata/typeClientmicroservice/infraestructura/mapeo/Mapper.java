package com.nttdata.typeClientmicroservice.infraestructura.mapeo;

import com.nttdata.typeClientmicroservice.dominio.entidades.TypeClienDTO;
import com.nttdata.typeClientmicroservice.infraestructura.model.document.TypeClient;
import org.springframework.beans.BeanUtils;

public class Mapper {

    public static TypeClienDTO entityToDto(TypeClient typeClient){
        TypeClienDTO typeClienDTO = new TypeClienDTO();
        BeanUtils.copyProperties(typeClient,typeClienDTO);
        return typeClienDTO;
    }

    public static TypeClient dtoToEntity(TypeClienDTO typeClienDTO){
        TypeClient typeClient = new TypeClient();
        BeanUtils.copyProperties(typeClienDTO,typeClient);
        return typeClient;
    }
}
