package com.Sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sample.Entity.Estorno;

@Repository
public interface EstornoRepository extends CrudRepository<Estorno, Long> {

}
