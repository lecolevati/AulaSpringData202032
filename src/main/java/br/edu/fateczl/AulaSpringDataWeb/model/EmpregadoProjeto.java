package br.edu.fateczl.AulaSpringDataWeb.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
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
@Table(name = "empregado_projeto")
@IdClass(EmpregadoProjetoId.class)
public class EmpregadoProjeto {

	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Empregado.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "empregadoMatricula", nullable = false)
	private Empregado empregado;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Projeto.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "projetoNumero", nullable = false)
	private Projeto projeto;
	
	@Column(name = "data_alocacao", nullable = false)
	private LocalDate dataAlocacao;
	
}
