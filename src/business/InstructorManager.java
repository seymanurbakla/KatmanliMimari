package business;


import core.loggin.Logger;
import dataAccess.Instructor.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    ArrayList<String> instructorList = new ArrayList<>();
    private InstructorDao instructorDao;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public InstructorManager() {

    }

    public void add(Instructor instructor) throws Exception {
        instructorDao.addInstructor(instructor);
        for (Logger logger:loggers) {
            logger.log(instructor.getName());
        }
        }

    public InstructorDao getInstructorDao() {
        return instructorDao;
    }

    public void setInstructorDao(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    public List<Logger> getLoggers() {
        return loggers;
    }

    public void setLoggers(List<Logger> loggers) {
        this.loggers = loggers;
    }
}
