package com.g30.jpa.service;

import com.g30.jpa.entity.Category;
import com.g30.jpa.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dmanrique
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }
    
    public Category getCategoryById(Long idCat){
        return categoryRepository.findById(idCat).get();
    }
    
    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
}
