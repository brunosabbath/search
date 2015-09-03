package com.bruno.engine.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.bruno.engine.model.Gene;

public class IcgcParser implements Parser{

	private BufferedReader br;
	
	@Override
	public List<Gene> getListGene() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void start() {
		openFile();
		parse();
		closeFile();
	}

	@Override
	public void openFile() {
		try{
			br = new BufferedReader(new FileReader("/Users/bruno/Desktop/unl/research cui/databases/simple_somatic_mutation.open.ALL-US.tsv"));
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void parse() {
		try {
		    String line = br.readLine();
		    System.out.println(line);
		    
		    line = br.readLine();
		    System.out.println(line);
		    /*while (line != null) {
		    	
		    	System.out.println(line);
		        line = br.readLine();
		        
		    }*/
		    
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

}
