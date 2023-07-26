package com.wasiniewski.learnspringweb;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse() {
        return Arrays.asList(
                new Course(1, "learn aws", "28minute"),
                new Course(2, "java", "28minute"),
                new Course(3, "learn azure", "28minutes")
        );
    }

}