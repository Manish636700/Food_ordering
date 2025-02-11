package com.OnlineFoodOrdering.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    public List<IngredientsItems> getIngredientsItems() {
        return ingredientsItems;
    }

    public void setIngredientsItems(List<IngredientsItems> ingredientsItems) {
        this.ingredientsItems = ingredientsItems;
    }

    @JsonBackReference
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<IngredientsItems> ingredientsItems = new ArrayList<>();

}
