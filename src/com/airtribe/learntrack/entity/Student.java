package com.airtribe.learntrack.entity;

public class Student extends Person {
    private String batch;
    private boolean active;

    public Student(int id, String firstName, String lastName, String email, String batch) {
        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = true;
    }

    public Student(int id, String firstName, String lastName, String batch) {
        super(id, firstName, lastName, "");
        this.batch = batch;
        this.active = true;
    }

    @Override
    public String getDisplayName() {
        return "Student: " + super.getDisplayName() + " | Batch: " + batch + " | Active: " + active;
    }

    public int getId() { return id; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
