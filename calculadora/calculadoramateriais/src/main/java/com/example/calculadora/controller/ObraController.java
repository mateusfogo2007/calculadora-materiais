package com.example.calculadora.controller;
import com.example.calculadora.model.Parede;
import com.example.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/obra")
public class ObraController {
    @Autowired
    private CalculadoraService service;
    @PostMapping("/concreto")
    public Double calcularConcreto(@RequestBody List<Parede> paredes, @RequestParam Double hViga) {
        return service.calcularVolumeConcreto(paredes, hViga);
    }
}