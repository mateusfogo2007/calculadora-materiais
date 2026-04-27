package com.example.calculadora.service;
import com.example.calculadora.model.Parede;
import com.example.calculadora.repository.ParedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CalculadoraService {
    @Autowired
    private ParedeRepository repository;

    public Double calcularVolumeConcreto(List<Parede> paredes, Double alturaViga) {
        return paredes.stream()
                .mapToDouble(p -> p.getLargura() * p.getComprimento() * alturaViga)
                .sum();
    }
    public Double calcularTijolos(List<Parede> paredes, Double areaTijolo) {
        double areaTotal = paredes.stream()
                .mapToDouble(p -> (p.getComprimento() * p.getAltura()) - p.getAreaAberturas())
                .sum();
        return Math.ceil(areaTotal / areaTijolo);
    }
    public void salvarParede(Parede parede) {
        repository.save(parede);
    }
}