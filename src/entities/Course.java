package entities;

public class Course {
    private String name;
    private Instructor lecturer;
    private int price;

    public Course(String name, Instructor lecturer, int price) {
        this.name = name;
        this.lecturer = lecturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getLecturer() {
        return lecturer;
    }

    public void setLecturer(Instructor lecturer) {
        this.lecturer = lecturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
