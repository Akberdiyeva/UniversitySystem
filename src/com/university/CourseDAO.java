package com.university;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public void addCourse(Course course) {
        String sql = "INSERT INTO courses(name, credits, professor_id) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, course.getName());
            ps.setInt(2, course.getCredits());
            ps.setInt(3, course.getProfessor().getId());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();

        String sql = """
            SELECT c.id, c.name, c.credits,
                   p.id as pid, p.name as pname, p.lastname
            FROM courses c
            JOIN professors p ON c.professor_id = p.id
            """;

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Professor professor = new Professor(
                        rs.getInt("pid"),
                        rs.getString("pname"),
                        rs.getString("lastname")
                );

                courses.add(
                        new Course(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("credits"),
                                professor
                        )
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }

    public void updateCourseCredits(int id, int credits) {
        String sql = "UPDATE courses SET credits = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, credits);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCourse(int id) {
        String sql = "DELETE FROM courses WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
