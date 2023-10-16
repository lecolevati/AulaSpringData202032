package br.edu.fateczl.AulaSpringDataWeb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.fateczl.AulaSpringDataWeb.controller.CategoriaController;
import br.edu.fateczl.AulaSpringDataWeb.controller.ChefeController;
import br.edu.fateczl.AulaSpringDataWeb.controller.DeptoController;
import br.edu.fateczl.AulaSpringDataWeb.controller.EmpregadoController;

@SpringBootTest
class AulaSpringDataWebApplicationTests {

	@Autowired
	private CategoriaController cCont;

	@Autowired
	private DeptoController dCont;

	@Autowired
	private EmpregadoController eCont;

	@Autowired
	private ChefeController chCont;

	@Test
	void contextLoads() {
//		cCont.opCategoria();
//		dCont.opDepto();
//		eCont.opEmp();
		chCont.opChefe();
	}

}
