package com.flow.ramasfuncion.ramasfuncion.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJosue {

    @GetMapping("/josue")
    public String getMensaje() {
        return "MENSAJE";
    }
}
