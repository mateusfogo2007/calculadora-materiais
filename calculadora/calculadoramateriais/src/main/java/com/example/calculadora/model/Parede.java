package com.example.calculadora.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Parede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double comprimento;
    private Double largura;
    private Double altura;
    private Double areaJanelas = 0.0;
    private Double areaPortas = 0.0;
    private Double areaAberturas = 0.0;
}