package business;

import core.loggin.Logger;
import dataAccess.Course.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    ArrayList<String> courseList = new ArrayList<>();
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void addCourse(Course course) throws Exception {
        for(String dongu : courseList){
            if(course.getName() == dongu){
                throw new Exception("Kurs ismi tekrar edilemez.");
            }
        }
        if (course.getPrice()<20){
            throw new Exception("Kurs fiyatı 20 den küçük olamaz!");
        }
        courseList.add(course.getName());
        courseDao.addCourse(course);
        for (Logger logger:loggers) {
            logger.log(course.getName());
        }
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public List<Logger> getLoggers() {
        return loggers;
    }

    public void setLoggers(List<Logger> loggers) {
        this.loggers = loggers;
    }
}
