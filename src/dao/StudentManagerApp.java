package dao;
import java.util.List;
import java.util.Scanner;

import dao.EnrollmentDAO;
import model.Enrollment;

public class StudentManagerApp {
    public static void main(String[] args) {
        EnrollmentDAO dao = new EnrollmentDAO();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== School Database Manager ===");
            System.out.println("1. Display All Student Enrollments");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    List<Enrollment> enrollments = dao.getAllEnrollments();
                    if (enrollments.isEmpty()) {
                        System.out.println("⚠️ No enrollments found.");
                    } else {
                        enrollments.forEach(System.out::println);
                    }
                    break;
                case 2:
                    System.out.println("👋 Exiting...");
                    break;
                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 2);

        sc.close();
    }
}
