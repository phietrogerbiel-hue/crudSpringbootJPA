package com.project.springCrud.repositories;

import com.project.springCrud.entities.Category;
import com.project.springCrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
