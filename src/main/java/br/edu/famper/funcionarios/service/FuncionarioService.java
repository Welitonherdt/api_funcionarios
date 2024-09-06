package br.edu.famper.funcionarios.service;

import br.edu.famper.funcionarios.model.Funcionario;
import br.edu.famper.funcionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FuncionarioService {


    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> findById(Long id) {
        return funcionarioRepository.findById(id);
    }

    public Funcionario update(Funcionario funcionario) {
        Funcionario salvo = funcionarioRepository.findById(funcionario.getCodigo())
                .orElseThrow(() ->
                        new RuntimeException("Funcionario nao encontrado!")
                );
        salvo.setNome(funcionario.getNome());
        salvo.setCargo(funcionario.getCargo());
        salvo.setDepartamento(funcionario.getDepartamento());
        salvo.setDataAdmissao(funcionario.getDataAdmissao());
        salvo.setEmail(funcionario.getEmail());
        salvo.setTelefone(funcionario.getTelefone());
        return funcionarioRepository.save(salvo);
    }
    public void deleteByYd(Long id){
        funcionarioRepository.deleteById(id);
    }


}
