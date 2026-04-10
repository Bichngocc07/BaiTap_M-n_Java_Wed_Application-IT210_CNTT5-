package org.example.BaiTap03;

import com.restaurant.bai3.service.AdminDishService;
import com.restaurant.common.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminDishController {

    @Autowired
    private AdminDishService service;

    // Mở form edit
    @GetMapping("/bai3/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Dish dish = service.findById(id);

        // Bẫy ID không tồn tại
        if (dish == null) {
            model.addAttribute("error", "Không tìm thấy món ăn yêu cầu!");
            return "redirect:/bai2/dishes";
        }

        model.addAttribute("dish", dish);
        return "edit-dish";
    }

    // Submit form
    @PostMapping("/bai3/edit")
    public String updateDish(@ModelAttribute Dish dish) {
        service.updateDish(dish);
        return "redirect:/bai2/dishes";
    }
}