package br.edu.famper.funcionarios.repository;

import br.edu.famper.funcionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
}
