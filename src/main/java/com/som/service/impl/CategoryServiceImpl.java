package com.som.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.som.entity.Category;
import com.som.repository.CategoryRepository;
import com.som.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public Boolean saveCategory(Category category) {
		
		category.setIsDelete(false);
		category.setCreatedBy(1);
		category.setUpdatedBy(1);
		category.setCreatedOn(LocalDateTime.now());
		category.setUpdatedOn(LocalDateTime.now());
		Category saveCategory = categoryRepository.save(category);
		
		if(ObjectUtils.isEmpty(saveCategory))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	@Override
	public List<Category> getAllCategory() {
		
		List<Category> categoryDetails = categoryRepository.findAll();
		
		return categoryDetails;
	}

}
