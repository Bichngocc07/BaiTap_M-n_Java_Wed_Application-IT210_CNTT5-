package org.example.ss06.controller;

import com.edupath.model.Course;
import com.edupath.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    // LIST + FILTER
    @GetMapping("/list")
    public String list(
            @RequestParam(required = false) String level,
            @RequestParam(required = false) Double maxFee,
            Model model) {

        List<Course> courses = service.filter(level, maxFee);

        model.addAttribute("courses", courses);

        if (courses.isEmpty()) {
            model.addAttribute("message",
                    "Hiện chưa có lớp học phù hợp với trình độ này");
        }

        return "course/list";
    }

    // DETAIL
    @GetMapping("/detail/{code}")
    public String detail(@PathVariable String code, Model model) {
        model.addAttribute("course", service.findByCode(code));
        return "course/detail";
    }

    // FORM UPDATE
    @GetMapping("/edit/{code}")
    public String edit(@PathVariable String code, Model model) {
        model.addAttribute("course", service.findByCode(code));
        return "course/form";
    }

    // UPDATE (PRG)
    @PostMapping("/update")
    public String update(@ModelAttribute Course course,
                         RedirectAttributes ra) {

        service.update(course);
        ra.addFlashAttribute("success", "Cập nhật thành công");

        return "redirect:/course/list";
    }

    // DELETE
    @PostMapping("/delete/{code}")
    public String delete(@PathVariable String code,
                         RedirectAttributes ra) {

        boolean ok = service.delete(code);

        if (!ok) {
            ra.addFlashAttribute("error",
                    "Không thể hủy khóa học đã có học viên đăng ký");
        }

        return "redirect:/course/list";
    }
}