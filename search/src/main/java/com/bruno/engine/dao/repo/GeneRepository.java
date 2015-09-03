package com.bruno.engine.dao.repo;

import java.util.List;

import com.bruno.engine.model.Gene;

import org.springframework.data.repository.CrudRepository;


public interface GeneRepository extends CrudRepository<Gene,Long> {

	public List<Gene> findBySymbol(String name);
}
