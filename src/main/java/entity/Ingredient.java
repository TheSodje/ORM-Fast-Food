package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    private Long id;
    private String ingredient_name;

    @ManyToMany(mappedBy = "ingredient")
    private List<Product> product = new ArrayList<>();

}



