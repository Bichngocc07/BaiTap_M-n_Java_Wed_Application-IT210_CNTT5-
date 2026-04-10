package com.restaurant.bai3.service;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminDishService {

    private List<Dish> dishes = new ArrayList<>(List.of(
            new Dish(1L, "Phở bò", 50000, true),
            new Dish(2L, "Bún chả", 45000, false),
            new Dish(3L, "Cơm tấm", 40000, true)
    ));

    public Dish findById(Long id) {
        return dishes.stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void updateDish(Dish updatedDish) {
        for (int i = 0; i < dishes.size(); i++) {
            if (dishes.get(i).getId().equals(updatedDish.getId())) {
                dishes.set(i, updatedDish);
                return;
            }
        }
    }
}