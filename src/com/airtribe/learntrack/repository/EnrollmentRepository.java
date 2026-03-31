package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Enrollment;
import java.util.*;

public class EnrollmentRepository {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void add(Enrollment e) { enrollments.add(e); }
    public List<Enrollment> getAll() { return enrollments; }
}
