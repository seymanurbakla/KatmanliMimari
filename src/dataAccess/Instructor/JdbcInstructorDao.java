package dataAccess.Instructor;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi.");

    }
}
