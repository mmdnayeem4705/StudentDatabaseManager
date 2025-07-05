package model;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private String teacher;

    public Course(int courseId, String courseName, int credits, String teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.teacher = teacher;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course [ID=" + courseId + ", Name=" + courseName + ", Credits=" + credits + ", Teacher=" + teacher + "]";
    }
}
