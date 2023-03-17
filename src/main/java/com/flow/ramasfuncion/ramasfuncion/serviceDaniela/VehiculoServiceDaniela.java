package com.flow.ramasfuncion.ramasfuncion.serviceDaniela;

import com.flow.ramasfuncion.ramasfuncion.modeloDaniela.VehiculoDaniela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehiculoServiceDaniela {
    List<VehiculoDaniela> vehiculosDaniela;

    @Autowired
    public void VehiculoDanielaSilvaServicio() {
        inicializarVehiculos("Moto");
        inicializarVehiculos("Carro");
        inicializarVehiculos("Camioneta");
    }


    public String obtenerMotos() {
        return vehiculosDaniela.stream().filter(x -> x.getTipo().equalsIgnoreCase("Moto")).collect(Collectors.toList()).toString();
    }

    public String obtenerCarros() {
        return vehiculosDaniela.stream().filter(x -> x.getTipo().equalsIgnoreCase("Carro")).collect(Collectors.toList()).toString();
    }

    public String obtenerCamionetas() {
        return vehiculosDaniela.stream().filter(x -> x.getTipo().equalsIgnoreCase("Camioneta")).collect(Collectors.toList()).toString();

    }

    private void inicializarVehiculos(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            tipo = "Moto";
        }
        if (vehiculosDaniela == null) {
            vehiculosDaniela = new ArrayList<>();
        }
        for (int i = 0; i <= 10; i++) {
            VehiculoDaniela vehiculoDaniela = new VehiculoDaniela();
            vehiculoDaniela.setId(vehiculosDaniela.size() + 1);
            vehiculoDaniela.setAnio(elegirAnio());
            vehiculoDaniela.setColor(elegirColor());
            vehiculoDaniela.setTipo(tipo);
            vehiculoDaniela.setMarca(tipo != null && (tipo.equalsIgnoreCase("Carro")
                    || tipo.equalsIgnoreCase("Camioneta")) ? elegirMarcaAuto() : elegirMarcaMoto());
            vehiculosDaniela.add(vehiculoDaniela);
        }

    }

    private Integer elegirAnio() {
        int numero = 0;
        Integer dato = null;
        do {
            numero = (int) (Math.random() * 100);
        } while (numero > 3 || numero < 0);
        switch (numero) {
            case 0:
                dato = 2020;
                break;
            case 1:
                dato = 2021;
                break;
            case 2:
                dato = 2022;
                break;
            case 3:
                dato = 2023;
                break;
            default:
                break;
        }
        return dato;
    }

    private String elegirMarcaAuto() {
        int numero = 0;
        String dato = "";
        do {
            numero = (int) (Math.random() * 100);
        } while (numero > 3 || numero < 0);
        switch (numero) {
            case 0:
                dato = "Toyota";
                break;
            case 1:
                dato = "Chevrolet";
                break;
            case 2:
                dato = "Hyundai";
                break;
            case 3:
                dato = "Nissan";
                break;
            default:
                break;
        }
        return dato;
    }

    private String elegirMarcaMoto() {
        int numero = 0;
        String dato = "";
        do {
            numero = (int) (Math.random() * 100);
        } while (numero > 3 || numero < 0);
        switch (numero) {
            case 0:
                dato = "Yamaha";
                break;
            case 1:
                dato = "Ducati";
                break;
            case 2:
                dato = "KTM";
                break;
            case 3:
                dato = "BMW";
                break;
            default:
                break;
        }
        return dato;
    }

    private String elegirColor() {
        int numero = 0;
        String dato = "";
        do {
            numero = (int) (Math.random() * 100);
        } while (numero > 3 || numero < 0);
        switch (numero) {
            case 0:
                dato = "Rojo";
                break;
            case 1:
                dato = "Azul";
                break;
            case 2:
                dato = "Negro";
                break;
            case 3:
                dato = "Gris";
                break;
            default:
                break;
        }
        return dato;
    }
}
