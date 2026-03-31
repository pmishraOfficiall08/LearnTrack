package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.repository.StudentRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class StudentService {
    private StudentRepository repo = new StudentRepository();

    public void addStudent(String fn, String ln, String email, String batch) {
        repo.add(new Student(IdGenerator.getStudentId(), fn, ln, email, batch));
    }

    public void listStudents() {
        for (Student s : repo.getAll()) {
            System.out.println(s.getDisplayName());
        }
    }

    public Student findStudent(int id) {
        return repo.findById(id);
    }
}
