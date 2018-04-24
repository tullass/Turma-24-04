package com.Sample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sample.Entity.Fatura;
import com.Sample.repository.FaturaRepository;

@Service
public class FaturaService {

	@Autowired
	private FaturaRepository faturaRepository;

	public Object findAll() {
		return faturaRepository.findAll();
	}

	public Object Querry() {
		return faturaRepository.querey();
	}

	public List<Fatura> findByAdiantamentos(Boolean b) {
		return faturaRepository.findByAdiantamento(true);
	}

	public Fatura findById(Long id) {
		return faturaRepository.findOne(id);
	}

	public Fatura save(Fatura fatura) {
		return faturaRepository.save(fatura);
	}

	public void delete(Fatura fatura) {
		faturaRepository.delete(fatura);
		return;
	}

}
