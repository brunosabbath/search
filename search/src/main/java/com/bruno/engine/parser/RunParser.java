package com.bruno.engine.parser;

public class RunParser {

	public static void main(String[] args) {
		//Parser p = new CosmicParser();
		Parser p = new IcgcParser();
		p.start();
		//List<Gene> list = p.getListGene(); 
		
	}
	
}