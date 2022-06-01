package com.example.apialunosigor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/aluno")
public class AlunosController {

    @PostMapping(path="/add")
    public @ResponseBody String addNewAluno(@requestParam String nome, @request String email){

    }
}
