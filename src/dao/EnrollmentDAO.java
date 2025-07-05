package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Enrollment;

public class EnrollmentDAO {
    private final String URL = "jdbc:postgresql://localhost:5432/SchoolDB";
    private final String USER = "postgres";
    private final String PASSWORD = "Neo@2003";

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public List<Enrollment> getAllEnrollments() {
        List<Enrollment> list = new ArrayList<>();
        String sql = """
            SELECT
                S.StudentID,
                S.Name AS StudentName,
                S.Age,
                S.Major,
                C.CourseID,
                C.CourseName,
                C.Credits,
                C.Teacher,
                E.EnrollmentDate
            FROM Students S
            JOIN Enrollments E ON S.StudentID = E.StudentID
            JOIN Courses C ON E.CourseID = C.CourseID;
        """;

        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Enrollment(
                        rs.getInt("StudentID"),
                        rs.getString("StudentName"),
                        rs.getInt("Age"),
                        rs.getString("Major"),
                        rs.getInt("CourseID"),
                        rs.getString("CourseName"),
                        rs.getInt("Credits"),
                        rs.getString("Teacher"),
                        rs.getDate("EnrollmentDate")
                ));
            }
        } catch (Exception e) {
            System.out.println("❌ Error fetching enrollment data: " + e.getMessage());
        }
        return list;
    }
}
