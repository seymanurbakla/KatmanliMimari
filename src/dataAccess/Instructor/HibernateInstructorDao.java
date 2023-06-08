package dataAccess.Instructor;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");

    }
}
