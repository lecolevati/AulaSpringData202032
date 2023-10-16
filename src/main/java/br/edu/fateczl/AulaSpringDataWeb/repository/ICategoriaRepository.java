package br.edu.fateczl.AulaSpringDataWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.AulaSpringDataWeb.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

}
