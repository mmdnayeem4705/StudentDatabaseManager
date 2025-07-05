package model;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String major;

    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + name + ", Age=" + age + ", Major=" + major + "]";
    }
}
