package br.edu.fateczl.ExemploSpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.ExemploSpringData.model.EmpregadoProjeto;
import br.edu.fateczl.ExemploSpringData.model.EmpregadoProjetoId;

public interface IEmpregadoProjetoRepository extends JpaRepository<EmpregadoProjeto, EmpregadoProjetoId>{

}
