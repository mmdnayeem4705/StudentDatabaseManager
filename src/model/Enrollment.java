package model;

import java.sql.Date;

public class Enrollment {
    private int studentId;
    private String studentName;
    private int age;
    private String major;
    private int courseId;
    private String courseName;
    private int credits;
    private String teacher;
    private Date enrollmentDate;

    public Enrollment(int studentId, String studentName, int age, String major,
                      int courseId, String courseName, int credits, String teacher,
                      Date enrollmentDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.major = major;
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.teacher = teacher;
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "\nStudent ID   : " + studentId +
               "\nName         : " + studentName +
               "\nAge          : " + age +
               "\nMajor        : " + major +
               "\nCourse ID    : " + courseId +
               "\nCourse Name  : " + courseName +
               "\nCredits      : " + credits +
               "\nTeacher      : " + teacher +
               "\nEnroll Date  : " + enrollmentDate +
               "\n-------------------------";
    }
}
