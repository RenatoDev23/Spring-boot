package com.projetocomspringbootejava.projetocomspringbootejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetocomspringbootejava.projetocomspringbootejava.entities.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long>{


}
