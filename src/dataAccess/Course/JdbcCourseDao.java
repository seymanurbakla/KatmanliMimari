package dataAccess.Course;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi.");

    }
}
