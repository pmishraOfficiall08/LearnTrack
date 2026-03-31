package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Student;
import java.util.*;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void add(Student s) { students.add(s); }
    public List<Student> getAll() { return students; }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}
