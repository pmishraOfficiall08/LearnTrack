package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.CourseStatus;

public class Course {
    private int id;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private CourseStatus status;

    public Course(int id, String name, String desc, int duration) {
        this.id = id;
        this.courseName = name;
        this.description = desc;
        this.durationInWeeks = duration;
        this.status = CourseStatus.ACTIVE;
    }

    public int getId() { return id; }
    public String getCourseName() { return courseName; }
    public CourseStatus getStatus() { return status; }
    public void setStatus(CourseStatus status) { this.status = status; }
}
