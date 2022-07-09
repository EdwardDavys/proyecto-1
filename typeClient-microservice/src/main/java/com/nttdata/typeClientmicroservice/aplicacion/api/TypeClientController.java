package com.nttdata.typeClientmicroservice.aplicacion.api;

import com.nttdata.typeClientmicroservice.dominio.entidades.TypeClienDTO;
import com.nttdata.typeClientmicroservice.dominio.servicios.TypeClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/typeclients")
public class TypeClientController {

    @Autowired
    private TypeClientServiceImpl typeClientService;

    @GetMapping
    public Flux<TypeClienDTO> getTypeClients(){
        return typeClientService.getAll();
    }

    @GetMapping("/{idTypeClient}")
    public Mono<TypeClienDTO> getTypeClient(@PathVariable String idTypeClient){
        return typeClientService.getTypeClient(idTypeClient);
    }

    @PostMapping
    public Mono<TypeClienDTO> register(@RequestBody Mono<TypeClienDTO> typeClienDTOMono ){
        return typeClientService.save(typeClienDTOMono);
    }

    @PutMapping("/{idTypeClient}")
    public Mono<TypeClienDTO> upateTypeClient(@RequestBody Mono<TypeClienDTO> typeClienDTOMono, @PathVariable String idTypeClient){
        return typeClientService.updateTypeCliente(typeClienDTOMono,idTypeClient);

    }

    @DeleteMapping("/{idTypeClient}")
    public Mono<Void> deleteTypeClient(@PathVariable String idTypeClient){
        return typeClientService.deleteTypeClient(idTypeClient);
    }

}
