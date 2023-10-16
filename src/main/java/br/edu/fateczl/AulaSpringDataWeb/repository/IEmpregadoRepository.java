package br.edu.fateczl.AulaSpringDataWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.AulaSpringDataWeb.model.Empregado;

public interface IEmpregadoRepository extends JpaRepository<Empregado, Integer> {

}
