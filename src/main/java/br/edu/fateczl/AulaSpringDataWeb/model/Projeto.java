package br.edu.fateczl.AulaSpringDataWeb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "projeto")
public class Projeto {

	@Id
	@Column(name = "numero", nullable = false)
	private int numero;

	@Column(name = "nome", length = 40, nullable = false)
	private String nome;
	
	@Column(name = "horas", nullable = false)
	private int horas;
}
