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
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "tipo", length = 15, nullable = false)
	private String tipo;
	
}
