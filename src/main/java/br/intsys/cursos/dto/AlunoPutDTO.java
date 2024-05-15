package br.intsys.cursos.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import br.intsys.cursos.model.Aluno;

public class AlunoPutDTO {
	@NotBlank
	@Length(max = 30)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void update(Aluno item) {
		item.setNome(this.nome);
	}
}