package lab7;

interface PersonInterface {
    int computeTotalWealth();
    String getName();
}

interface AnotherPersonInterface {
    int measureIntelligence(String x);
}
public class Person implements PersonInterface, AnotherPersonInterface {
    
    // Field Variables
    int cashSaving, retirementFund;
    String firstName, lastName;
    
    // Constructor
    Person (int a, int b, String c, String d) {
        cashSaving = a;
        retirementFund = b;
        firstName = c;
        lastName = d;
    }
    
    // Method
    public int computeTotalWealth () {
        return cashSaving + retirementFund;
    }
    
    public String getName () {
        return firstName + lastName;
    }
    
    public int measureIntelligence (String intel) {
        return 50;
    }
}
