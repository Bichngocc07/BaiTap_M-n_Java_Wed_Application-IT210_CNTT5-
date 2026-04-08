package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai3")
public class Bai3Controller {

    
    @GetMapping("/orders/{id}")
    @ResponseBody
    public String getOrderByPath(@PathVariable long id) {
        return "Chi tiết đơn hàng số " + id;
    }

    @GetMapping("/orders")
    @ResponseBody
    public String getOrderByParam(@RequestParam long id) {
        return "Chi tiết đơn hàng số " + id;
    }
}
