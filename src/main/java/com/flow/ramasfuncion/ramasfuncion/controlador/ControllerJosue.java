package com.flow.ramasfuncion.ramasfuncion.controlador;

import com.flow.ramasfuncion.ramasfuncion.dto.Country;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ControllerJosue {

    @GetMapping("/josue")
    public ResponseEntity<List<Country>> getCountries() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("countries.json").getFile());
        Country[] data = new Gson().fromJson(new FileReader(file), Country[].class);
        return ResponseEntity.ok(Stream.of(data).collect(Collectors.toList()));
    }
}
