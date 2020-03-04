/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

// Electronic Interface
interface ElectronicsInterface {
    String getManufacturer ();
}

// Abstract mid class Electronics
abstract class Electronics extends Product implements ElectronicsInterface {

    // Field variables
    String manufacturer;
    
    //Constructor
    Electronics (double rP, String m) {
        super (rP);
        setManufacturer(m);
    }
    
    // Getters and Setters
    void setManufacturer (String m) {
        manufacturer = m;
    }
    
    public String getManufacturer () {
        return manufacturer;
    }
}
