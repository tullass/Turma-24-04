package com.Sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Entity.Fatura;

@Repository
public interface FaturaRepository extends CrudRepository<Fatura, Long> {
	public List<Fatura> findByAdiantamento(Boolean adiantamento);

	@Query("SELECT c FROM Fatura c WHERE c.adiantamento=true AND c.inscrito=true")
	public Iterable<Fatura> querey();

}
