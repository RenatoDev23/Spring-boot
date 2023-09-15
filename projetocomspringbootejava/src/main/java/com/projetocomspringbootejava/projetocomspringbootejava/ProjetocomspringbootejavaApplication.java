package com.projetocomspringbootejava.projetocomspringbootejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetocomspringbootejava.projetocomspringbootejava.entities.Category;
import com.projetocomspringbootejava.projetocomspringbootejava.repositories.CategoryRepository;

@SpringBootApplication
public class ProjetocomspringbootejavaApplication  implements CommandLineRunner{
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetocomspringbootejavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);

		
		
	}

}
