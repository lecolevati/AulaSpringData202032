package br.edu.fateczl.AulaSpringDataWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.fateczl.AulaSpringDataWeb.model.Depto;
import br.edu.fateczl.AulaSpringDataWeb.repository.IDeptoRepository;
import jakarta.transaction.Transactional;

@Controller
public class DeptoController {

	@Autowired
	private IDeptoRepository dRep;

	@Transactional
	public void opDepto() {
		Depto d1 = new Depto();
		d1.setCodigo(1);
		d1.setNome("Programação");

		dRep.save(d1);

		Depto dpt = dRep.fn_depto_sigla(d1.getCodigo());
		System.out.println(dpt);

		try {
			String saida = dRep.sp_depto_sigla(d1.getCodigo());
			System.out.println(saida);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
