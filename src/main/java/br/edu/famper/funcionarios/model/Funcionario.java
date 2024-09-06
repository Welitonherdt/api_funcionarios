package br.edu.famper.funcionarios.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Calendar;

@Entity
@Table(name = "tnl_funcionario")
@Data
public class Funcionario {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "funcionario_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "cargo", length = 150)
    private String cargo;

    @Column(name = "departamento", length = 150)
    private String departamento;

    @Column(name = "data admissao")
    private Date dataAdmissao;

    @Column(name = "email", length = 150)
    private String email;


    @Column(name = "telefone", length = 20)
    private String telefone;


}
