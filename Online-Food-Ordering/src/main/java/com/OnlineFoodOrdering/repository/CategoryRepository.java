package com.OnlineFoodOrdering.repository;

import com.OnlineFoodOrdering.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    public List<Category> findByRestaurantId(Long restaurantId);

    List<Category> findByNameAndRestaurantId(String name, Long restaurantId);
}
