package com.Sample.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.Sample.Entity.Aluno;
import com.Sample.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public Object findAll() {
		return alunoRepository.findAll();
	}

	public Aluno findById(Long id) {
		return alunoRepository.findOne(id);
	}

	public Aluno save(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public void delete(Long id) {
		alunoRepository.delete(id);
		return;
	}

}
