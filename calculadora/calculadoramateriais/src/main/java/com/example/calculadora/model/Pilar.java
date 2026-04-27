package com.example.calculadora.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Pilar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome; // Ex: P1, P2
}