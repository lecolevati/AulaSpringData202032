package br.edu.fateczl.AulaSpringDataWeb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "depto")
@NamedNativeQuery(
	name = "Depto.fn_depto_sigla",
	query = "SELECT codigo, nome, sigla FROM fn_depto_sigla(?1)",
	resultClass = Depto.class
)
@NamedStoredProcedureQuery(
	name = "Depto.sp_depto_sigla",
	procedureName = "sp_depto_sigla",
	parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN,
				name = "codigo", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT,
				name = "saida", type = String.class)
	}
)
public class Depto {

	@Id
	@Column(name = "codigo", nullable = false)
	private int codigo;
	
	@Column(name = "nome", length = 20, nullable = false)
	private String nome;

	@Column(name = "sigla", length = 3, nullable = true)
	private String sigla;
	
}







