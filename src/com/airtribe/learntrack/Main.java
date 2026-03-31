package com.airtribe.learntrack;

import com.airtribe.learntrack.service.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService ss = new StudentService();
        CourseService cs = new CourseService();
        EnrollmentService es = new EnrollmentService();

        while(true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Enroll");
            System.out.println("6. Exit");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch(choice) {
                    case 1:
                        System.out.print("FN: "); String fn = sc.nextLine();
                        System.out.print("LN: "); String ln = sc.nextLine();
                        System.out.print("Email: "); String em = sc.nextLine();
                        System.out.print("Batch: "); String bt = sc.nextLine();
                        ss.addStudent(fn, ln, em, bt);
                        break;

                    case 2:
                        ss.listStudents();
                        break;

                    case 3:
                        System.out.print("Name: "); String n = sc.nextLine();
                        System.out.print("Desc: "); String d = sc.nextLine();
                        System.out.print("Duration: "); int du = Integer.parseInt(sc.nextLine());
                        cs.addCourse(n, d, du);
                        break;

                    case 4:
                        cs.listCourses();
                        break;

                    case 5:
                        System.out.print("Student ID: "); int sid = Integer.parseInt(sc.nextLine());
                        System.out.print("Course ID: "); int cid = Integer.parseInt(sc.nextLine());
                        es.enroll(sid, cid);
                        break;

                    case 6:
                        return;

                    default:
                        System.out.println("Invalid option");
                }

            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
