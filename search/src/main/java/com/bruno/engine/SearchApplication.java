package com.bruno.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchApplication{
	
	/*@Autowired
	private GeneRepository repo;*/
	
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

	/*@Override
	public void run(String... args) throws Exception {
		
		Parser parser = new CosmicParser();
		parser.start();
		List<Gene> listGene = parser.getListGene();
		
		for(Gene g : listGene){
			repo.save(g);
		}
		
		
	}*/

}