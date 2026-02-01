package com.university;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseDAO courseDAO = new CourseDAO();

    @GetMapping
    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }
}

