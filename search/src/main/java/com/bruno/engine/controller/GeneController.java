package com.bruno.engine.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.engine.dao.manager.GeneManager;
import com.bruno.engine.dao.repo.GeneRepository;
import com.bruno.engine.exception.ErrorException;
import com.bruno.engine.model.Gene;

@RestController
@RequestMapping("/gene")
public class GeneController {

	@Autowired
	private GeneRepository repo;
	private GeneManager manager;
	private static final Logger logger = Logger.getLogger(GeneController.class.getName());
	
	public GeneController(){}
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public List<Gene> listRecommended(@PathVariable String name){
		
		
		logger.log(Level.FINE,"searching for " + name);
		List<Gene> list = repo.findBySymbol(name);
		
		if(list.isEmpty()){
			logger.log(Level.SEVERE,"nothing found for " + name);
			throw new ErrorException("No gene found");
		}
		
		logger.log(Level.FINE,"returning result for " + name);
		return list;
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Gene> list(){
		
		
		logger.log(Level.FINE,"searching for all ");
		List<Gene> list = (List<Gene>) repo.findAll();
		
		if(list.isEmpty()){
			logger.log(Level.SEVERE,"cant fetch all data");
			throw new ErrorException("No gene found");
		}
		
		logger.log(Level.FINE,"listing everybody");
		return list;
		
	}
	
}
