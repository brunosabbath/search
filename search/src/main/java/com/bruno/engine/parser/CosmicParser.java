package com.bruno.engine.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bruno.engine.builder.GeneBuilder;
import com.bruno.engine.dao.manager.GeneManager;
import com.bruno.engine.model.Gene;

public class CosmicParser implements Parser{
	
	private BufferedReader br;
	private GeneManager manager;
	private List<Gene> list;
	
	public List<Gene> getListGene(){
		return list;
	}
	
	@Override
	public void openFile() {
		try{
			//br = new BufferedReader(new FileReader("Cosmic_cancer_gene_list.txt"));
			br = new BufferedReader(new FileReader("hgmd_deaf_0925.txt"));
	         
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void parse() {
		manager = new GeneManager();
		
		try {
			list = new ArrayList<Gene>();
		    String line = br.readLine();
		    
		    while (line != null) {
		    	
		    	System.out.println(line);
		        line = br.readLine();
		        
		        //manager.add(GeneBuilder.strToGene(line));
		        //if(line != null)
		        	//list.add(GeneBuilder.strToGene(line));
		        
		        
		    }
		    
		}catch(IOException e){
			e.printStackTrace();

		} finally {
		    closeFile();
		}
		
	}

	@Override
	public void closeFile() {
		
		try {
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void start() {
		openFile();
		parse();
		closeFile();
		
	}

}
