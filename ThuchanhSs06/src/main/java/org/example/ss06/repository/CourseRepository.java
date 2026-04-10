package org.example.ss06.repository;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {

    private static final List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course("IELTS-6.5", "IELTS 6.5+", "Intermediate", 5000000,
                "Luyện đề chuyên sâu", "Mr.A", 12, 0, false, LocalDate.now()));

        courses.add(new Course("IELTS-7.0", "IELTS 7.0+", "Advanced", 7000000,
                "Chiến thuật band cao", "Mr.C", 16, 10, true, LocalDate.now()));

        courses.add(new Course("BASIC-ENG", "English Basic", "Beginner", 3000000,
                "Nền tảng tiếng Anh", "Ms.B", 10, 5, true, LocalDate.now()));

        courses.add(new Course("COMM-ENG", "Communication", "Intermediate", 4000000,
                "Giao tiếp thực tế", "Mr.D", 8, 0, false, LocalDate.now()));

        courses.add(new Course("KID-ENG", "Kids English", "Beginner", 2500000,
                "Tiếng Anh trẻ em", "Ms.E", 6, 0, false, LocalDate.now()));
    }

    public List<Course> findAll() {
        return courses;
    }
}