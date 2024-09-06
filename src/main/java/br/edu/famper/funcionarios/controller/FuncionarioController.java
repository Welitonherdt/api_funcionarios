package br.edu.famper.funcionarios.controller;

import br.edu.famper.funcionarios.model.Funcionario;
import br.edu.famper.funcionarios.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<Funcionario>>findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(funcionarioService.findAll());
    }

    @GetMapping("/{id}")
    public Optional<Funcionario> findById(@PathVariable Long id) {
        return funcionarioService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Funcionario> Create(@RequestBody Funcionario funcionario) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(funcionarioService.save(funcionario));
    }

    @PutMapping
    public ResponseEntity<Funcionario> Update(@RequestBody Funcionario funcionario) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(funcionarioService.update(funcionario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        funcionarioService.deleteByYd(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}