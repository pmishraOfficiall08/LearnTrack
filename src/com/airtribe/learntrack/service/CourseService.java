package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.repository.CourseRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class CourseService {
    private CourseRepository repo = new CourseRepository();

    public void addCourse(String name, String desc, int duration) {
        repo.add(new Course(IdGenerator.getCourseId(), name, desc, duration));
    }

    public void listCourses() {
        for (Course c : repo.getAll()) {
            System.out.println(c.getCourseName());
        }
    }

    public Course findCourse(int id) {
        return repo.findById(id);
    }
}
