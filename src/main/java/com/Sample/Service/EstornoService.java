package com.Sample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sample.Entity.Estorno;
import com.Sample.repository.EstornoRepository;

@Service
public class EstornoService {

	@Autowired
	private EstornoRepository estornoRepository;

	public Object findAll() {
		return estornoRepository.findAll();
	}

	public Estorno findById(Long id) {
		return estornoRepository.findOne(id);
	}

	public Estorno save(Estorno estorno) {
		return estornoRepository.save(estorno);
	}

	public void delete(Estorno estorno) {
		estornoRepository.delete(estorno);
		return;
	}

}
