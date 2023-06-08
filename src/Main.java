
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.loggin.DatabaseLogger;
import core.loggin.FileLogger;
import core.loggin.Logger;
import core.loggin.MailLogger;
import dataAccess.Category.HibernateCategoryDao;
import dataAccess.Course.JdbcCourseDao;
import dataAccess.Instructor.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        Instructor instructor1 = new Instructor("Engin","Demiroğ");
        Instructor instructor2 = new Instructor("Halit Enes","Kalaycı");

        Course course1 = new Course("Java ile Programlama",instructor1,200);
        Course course2 = new Course("Phthon ile Programlama",instructor2,100);

        Category category1 = new Category("Yazılım");
        Category category2 = new Category("Donanım");

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), List.of(loggers));
        instructorManager.add(instructor1);
        InstructorManager instructorManager2 = new InstructorManager(new HibernateInstructorDao(), List.of(loggers));
        instructorManager2.add(instructor2);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), List.of(loggers));
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), List.of(loggers));
        categoryManager.addCategory(category1);
        categoryManager.addCategory(category2);




















    }
}