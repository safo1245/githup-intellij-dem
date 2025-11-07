package Student;

public class Student {

    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

