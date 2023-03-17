package com.flow.ramasfuncion.ramasfuncion.controlador;

import com.flow.ramasfuncion.ramasfuncion.serviceDaniela.VehiculoServiceDaniela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehiculos")
public class ControllerDaniela {
    private VehiculoServiceDaniela vehiculoDanielaSilvaServicio;

    @Autowired
    public ControllerDaniela(VehiculoServiceDaniela vehiculoDanielaSilvaServicio) {
        this.vehiculoDanielaSilvaServicio = vehiculoDanielaSilvaServicio;
    }



    @GetMapping("/danny")
    public String getVehiculos() {
        vehiculoDanielaSilvaServicio.VehiculoDanielaSilvaServicio();
        return "     ----------------> Motos: "  + vehiculoDanielaSilvaServicio.obtenerMotos() + "     ----------------> Camionetas: "
                + vehiculoDanielaSilvaServicio.obtenerCamionetas() +"     ----------------> Carros: "+ vehiculoDanielaSilvaServicio.obtenerCarros();



    }
}
