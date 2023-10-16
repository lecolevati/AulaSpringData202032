package br.edu.fateczl.AulaSpringDataWeb.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.fateczl.AulaSpringDataWeb.model.Depto;
import br.edu.fateczl.AulaSpringDataWeb.model.Empregado;
import br.edu.fateczl.AulaSpringDataWeb.model.EmpregadoProjeto;
import br.edu.fateczl.AulaSpringDataWeb.model.Projeto;
import br.edu.fateczl.AulaSpringDataWeb.repository.IDeptoRepository;
import br.edu.fateczl.AulaSpringDataWeb.repository.IEmpregadoProjetoRepository;
import br.edu.fateczl.AulaSpringDataWeb.repository.IEmpregadoRepository;
import br.edu.fateczl.AulaSpringDataWeb.repository.IProjetoRepository;

@Controller
public class EmpregadoController {

	@Autowired
	private IEmpregadoRepository eRep;

	@Autowired
	private IDeptoRepository dRep;
	
	@Autowired
	private IProjetoRepository pRep;

	@Autowired
	private IEmpregadoProjetoRepository epRep;

	public void opEmp() {
		Empregado e1 = new Empregado();
		e1.setMatricula(12345);
		e1.setNome("Fulano de Tal");
		e1.setSexo("M");
		e1.setTelefone("1122334455");
		e1.setCargo("Pleno");

		Depto d = new Depto();
		d.setCodigo(1);
		d.setNome("Rec Humanos");
		dRep.save(d);

		e1.setDepto(d);

		eRep.save(e1);
		
		Projeto p = new Projeto(1001, "Projeto New", 500);
		pRep.save(p);
		
		EmpregadoProjeto ep = 
				new EmpregadoProjeto(e1, p, LocalDate.now());
		epRep.save(ep);
	}
}
