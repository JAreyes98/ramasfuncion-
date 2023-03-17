package com.flow.ramasfuncion.ramasfuncion.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCristhiam {

    @GetMapping("/Cris")
    public String getMensaje() {
        return "HOLA MUNDO dos";
    }

}
