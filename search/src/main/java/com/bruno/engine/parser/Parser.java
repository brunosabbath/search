package com.bruno.engine.parser;

import java.util.List;

import com.bruno.engine.model.Gene;

public interface Parser {
	
	public List<Gene> getListGene();
	public void start();
	public void openFile();
	public void parse();
	public void closeFile();
	
}
