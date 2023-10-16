package br.edu.fateczl.AulaSpringDataWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import br.edu.fateczl.AulaSpringDataWeb.model.Depto;

public interface IDeptoRepository extends JpaRepository<Depto, Integer>{
	Depto fn_depto_sigla(int codigo);
	
	@Procedure(name = "Depto.sp_depto_sigla")
	String sp_depto_sigla(@Param("codigo") int codigo);
}
