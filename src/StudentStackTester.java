package Student;

public class StudentStackTester {
    public static void main(String[] args) {
        GenericStack<Student> studentStack = new GenericStack<Student>(2);

        studentStack.push(new Student("Amina Ali", 2));
        studentStack.push(new Student("Mohamed Nur", 20));
        studentStack.push(new Student("Hodan Abdullahi", 3)); // triggers expand

        studentStack.display();

        System.out.println("\nTop student: " + studentStack.peek());
        System.out.println("Number of students: " + studentStack.size());

        studentStack.pop();
        studentStack.display();

        System.out.println("Is stack empty? " + studentStack.isEmpty());
    }
}