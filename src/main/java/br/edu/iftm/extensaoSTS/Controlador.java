package br.edu.iftm.extensaoSTS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

        @GetMapping("/alo")
        public Dominio greeting() {
                return new Dominio("alô mundo");
        }
}
