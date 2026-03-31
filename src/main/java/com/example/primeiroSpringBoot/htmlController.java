package com.example.primeiroSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class htmlController {

    @GetMapping("/pagina")

        public String pagina (){

        return "pagina";
    }

}





