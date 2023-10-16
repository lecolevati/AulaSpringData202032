package br.edu.fateczl.AulaSpringDataWeb.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "empregado")
@Inheritance(strategy = InheritanceType.JOINED)
public class Empregado {

	@Id
	@Column(name = "matricula", nullable = false)
	private int matricula ;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "sexo", length = 1, nullable = false)
	private String sexo;
	
	@Column(name = "telefone", length = 10, nullable = false)
	private String telefone;
	
	@Column(name = "data_admissao", nullable = true)
	private LocalDate dataAdmissao;
	
	@Column(name = "cargo", length = 20, nullable = false)
	private String cargo;
	
	@ManyToOne(targetEntity = Depto.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "deptoCodigo", nullable = false)
	private Depto depto;
	
}








