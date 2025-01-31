package br.intsys.cursos.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import br.intsys.cursos.model.Aluno;

public class AlunoPostDTO {
	@NotBlank
	@Length(max = 30)
	private String nome;

	public String getNome() {
		return nome;
	}

	public Aluno convert() {
		Aluno ret = new Aluno();
		ret.setNome(this.nome);
		return ret;
	}
}