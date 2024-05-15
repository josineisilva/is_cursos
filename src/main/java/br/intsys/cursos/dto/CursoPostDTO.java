package br.intsys.cursos.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import br.intsys.cursos.model.Curso;

public class CursoPostDTO {
	@NotBlank
	@Length(max = 20)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public Curso convert() {
		Curso ret = new Curso();
		ret.setDescricao(this.descricao);
		return ret;
	}
}