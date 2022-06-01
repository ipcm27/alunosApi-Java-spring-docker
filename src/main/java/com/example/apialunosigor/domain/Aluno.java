package com.example.apialunosigor.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nome;
    private String email;

}
