package com.example.apialunosigor.controller;


import com.example.apialunosigor.domain.Aluno;
import com.example.apialunosigor.repository.AlunoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/aluno")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewAluno(@RequestParam String nome, @RequestParam String email){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setEmail(email);
        alunoRepository.save(aluno);
        return "Salvo";
    }

    @GetMapping(path="/all") public @ResponseBody Iterable<Aluno> getAllAlunos(){
        return alunoRepository.findAll();
    }


}
