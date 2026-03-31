package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.repository.EnrollmentRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class EnrollmentService {
    private EnrollmentRepository repo = new EnrollmentRepository();

    public void enroll(int studentId, int courseId) {
        repo.add(new Enrollment(IdGenerator.getEnrollmentId(), studentId, courseId));
        System.out.println("Enrolled successfully!");
    }
}
