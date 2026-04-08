package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai4")
public class Bai4Controller {

    @GetMapping("/products")
    public String getProducts(
            @RequestParam String category,
            @RequestParam int limit,
            ModelMap model
    ) {
        model.addAttribute("category", category)
                .addAttribute("limit", limit)
                .addAttribute("message", "Tìm kiếm thành công");

        return "productList";
    }
}