package com.flow.ramasfuncion.ramasfuncion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class ControllerAlejandro {

    @GetMapping("/alejandro")
    public String getMensaje() {
        return "mensaje Alejandro";
    }

}
