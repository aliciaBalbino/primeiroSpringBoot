package com.example.primeiroSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class EstacaoController {

    @GetMapping ("/comodidades")
    public String responder (){

        return "Localização detectada no setor norte. Serviços: café e wifi disponíveis.";
    }



}
