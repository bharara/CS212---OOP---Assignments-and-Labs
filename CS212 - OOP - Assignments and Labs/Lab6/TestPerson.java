package Task;

public class TestPerson {
    public static void main(String[] args) {
        
        // Intilizing Objects
        Person p = new Person();
        Employee e = new Employee();
        Faculty f = new Faculty();
        Staff s = new Staff();
        Student st = new Student();
        
        // Invoking toString
        System.out.println(p.toString());    
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(s.toString());
        System.out.println(st.toString());
    }
    
}
