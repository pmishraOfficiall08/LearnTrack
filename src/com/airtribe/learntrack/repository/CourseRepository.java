package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Course;
import java.util.*;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public void add(Course c) { courses.add(c); }
    public List<Course> getAll() { return courses; }

    public Course findById(int id) {
        for (Course c : courses) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}
