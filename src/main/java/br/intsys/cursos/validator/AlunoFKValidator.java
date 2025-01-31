package br.intsys.cursos.validator;

import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.intsys.cursos.anotations.AlunoFK;
import br.intsys.cursos.model.Aluno;
import br.intsys.cursos.repository.AlunoRepository;

public class AlunoFKValidator implements ConstraintValidator<AlunoFK, Integer> {
	@Autowired
	private AlunoRepository repository;

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if (value != null) {
			Optional<Aluno> search = repository.findById(value);
			if (search.isPresent()) {
				return true;
			}
		}
		return false;
	}
}