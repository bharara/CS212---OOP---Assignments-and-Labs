package Task;
import java.util.Date;

public class Person {
    String name = "Bharara", adress, phone_num, email;
    
    public String toString () {
        return String.format("Person %s",name);
    }
}

class Student extends Person {
    String status;
    
    public String toString () {
        return String.format("Student %s",super.name);
    }
}

class Employee extends Person {
    String office;
    double salary;
    Date hired_date;
    
    public String toString () {
        return String.format("Employee %s",super.name);
    }
}

class Faculty extends Employee {
    String office_hours, rank;
    
    public String toString () {
        return String.format("Faculty %s",super.name);
    }
}

class Staff extends Employee {
    String title;
    
    public String toString () {
        return String.format("Staff %s",super.name);
    }
}
