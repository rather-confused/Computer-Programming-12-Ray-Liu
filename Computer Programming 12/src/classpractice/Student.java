package classpractice;
import java.util.ArrayList;

public class Student {


    private String FirstName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;

    static int StudentID = 0;


    Student(String Firstname) {
        this.FirstName = FirstName;
        ID = increment();

    }
    public static int increment(){
        return StudentID++;
    }

}





