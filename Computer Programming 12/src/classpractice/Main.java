package classPractice;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        student.addCourse(new Course("Chemistry 12", 98));
        student.addCourse(new Course("Physical Education 11/12", 93));
        student.addCourse(new Course("Computer Science", 92));
        student.addCourse(new Course("20th Century World History", 97));
        student.addCourse(new Course("AP Human Geography", 96));
        student.addCourse(new Course("Pre-Calculus 12", 100));
        student.addCourse(new Course("English 12", 99));
        student.addCourse(new Course("Music", 94));

        System.out.println(student);
        System.out.println("Student's Grade Average: " + student.getAverage());
        System.out.println("Courses:");
        student.printCourses();
    }
}