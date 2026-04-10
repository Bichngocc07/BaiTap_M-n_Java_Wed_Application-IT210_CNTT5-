package org.example.ss06.service;

import com.edupath.model.Course;
import com.edupath.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> filter(String level, Double maxFee) {
        return repo.findAll().stream()
                .filter(c -> level == null || level.isEmpty()
                        || c.getLevel().equalsIgnoreCase(level))
                .filter(c -> maxFee == null || c.getFee() <= maxFee)
                .toList();
    }

    public Course findByCode(String code) {
        return repo.findAll().stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public void update(Course updated) {
        Course c = findByCode(updated.getCode());
        if (c != null) {
            c.setFee(updated.getFee());
            c.setStartDate(updated.getStartDate());
        }
    }

    public boolean delete(String code) {
        Course c = findByCode(code);
        if (c != null && c.getStudentCount() == 0) {
            repo.findAll().remove(c);
            return true;
        }
        return false;
    }
}