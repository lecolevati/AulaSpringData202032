package br.edu.fateczl.AulaSpringDataWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.fateczl.AulaSpringDataWeb.model.Categoria;
import br.edu.fateczl.AulaSpringDataWeb.repository.ICategoriaRepository;

@Controller
public class CategoriaController {

	@Autowired
	private ICategoriaRepository cRep;
	
	public void opCategoria() {
		Categoria c1 = new Categoria(1, "Des Sw");
		Categoria c2 = new Categoria(2 ,"Manut Sw");
		Categoria c3 = new Categoria(3 ,"Cria Sw");
		Categoria c4 = new Categoria(4 ,"Novos Proj");
		Categoria c5 = new Categoria(5 ,"Mudança Proj");
		
		cRep.save(c1);
		cRep.save(c2);
		cRep.save(c3);
		cRep.save(c4);
		cRep.save(c5);
		
		List<Categoria> categorias = cRep.findAll();
		categorias.forEach(c -> System.out.println(c));
		
		Categoria categoria = cRep.findById(c4.getId()).get();
		System.out.println(categoria);
		
		c3.setTipo("Mud Proj");
		cRep.save(c3);
		
		cRep.delete(c5);
		
	}
	
	
}
