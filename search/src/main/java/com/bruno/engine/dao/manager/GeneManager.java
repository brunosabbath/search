package com.bruno.engine.dao.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bruno.engine.dao.repo.GeneRepository;
import com.bruno.engine.model.Gene;

public class GeneManager {
	
	@Autowired
	private GeneRepository repo;
	
	public List<Gene> findByGeneName(String name){
		return repo.findBySymbol(name);

	}
	
	public void add(Gene gene){
		repo.save(gene);
	}
	
}
