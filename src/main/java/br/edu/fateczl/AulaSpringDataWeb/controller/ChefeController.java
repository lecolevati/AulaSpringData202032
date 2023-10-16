package br.edu.fateczl.AulaSpringDataWeb.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.fateczl.AulaSpringDataWeb.model.Categoria;
import br.edu.fateczl.AulaSpringDataWeb.model.Chefe;
import br.edu.fateczl.AulaSpringDataWeb.model.Depto;
import br.edu.fateczl.AulaSpringDataWeb.repository.ICategoriaRepository;
import br.edu.fateczl.AulaSpringDataWeb.repository.IChefeRepository;
import jakarta.transaction.Transactional;

@Controller
public class ChefeController {

	@Autowired
	private IChefeRepository chRep;

	@Autowired
	private ICategoriaRepository cRep;

	@Transactional
	public void opChefe() {
		Chefe ch = new Chefe();
		ch.setMatricula(12346);
		ch.setNome("Beltrano de Tal");
		ch.setSexo("M");
		ch.setCargo("Chefe");
		ch.setTelefone("1122009988");
		ch.setData(LocalDate.of(2022, 4, 18));
		ch.setDataAdmissao(LocalDate.of(2021, 1, 10));

		Categoria cat = new Categoria(6, "Prog. Sênior");
		cRep.save(cat);

		Depto dep = new Depto();
		dep.setCodigo(1); // Já inserido

		ch.setCategoria(cat);
		ch.setDepto(dep);

		chRep.save(ch);
		try {
			List<Chefe> chefes = chRep.findAll();
			chefes.forEach(chefe -> System.out.println(chefe));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
