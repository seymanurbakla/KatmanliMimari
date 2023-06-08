package dataAccess.Course;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");

    }
}
