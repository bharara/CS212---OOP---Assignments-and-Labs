/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class Main {
    
  public static void main(String[] args) {
        
    // Create an object instance of Person class.
    Person person1 = new Person(10000, 20000, "Quintin", "Tarantino");
        
    // You can assign the object instance to
    // PersonInterface type.
    PersonInterface personinterface1 = person1;
        
    // Display data from person1 and personinterface1.
    // Observe that they refer to the same object instance.
    System.out.println(
      "person1.getName() = " + person1.getName() + "," +
      " person1.computeTotalWealth() = " + 
      person1.computeTotalWealth() + "," + 
      " person1.measureIntelligence() = " +         
      person1.measureIntelligence(person1.getName()));
        
    System.out.println(
      "personinterface1.getName() = " + personinterface1.getName() + "," +
      " personinterface1.computeTotalWealth() = " + 
      personinterface1.computeTotalWealth());
               
    // You can assign the object instance to
    // AnotherPersonInterface type.
    AnotherPersonInterface anotherpersoninterface1 = person1;
        
    // Check of object instance that is referred by personinterface1 and 
    // anotherpersoninterface1 is the same object instance.
    boolean b1 = (personinterface1 == anotherpersoninterface1);
    System.out.println("Do personinterface1 and anotherpersoninterface1 point to the same object instance? " + b1);
        
  }   
}
