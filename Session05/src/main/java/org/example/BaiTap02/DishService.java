package org.example.BaiTap02;

import com.restaurant.common.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    public List<Dish> getAllDishes() {
        return List.of(
                new Dish(1L, "Phở bò", 50000, true),
                new Dish(2L, "Bún chả", 45000, false),
                new Dish(3L, "Cơm tấm", 40000, true)
        );
    }
}