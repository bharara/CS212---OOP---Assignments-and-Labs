package Task;

// Main parent class
public abstract class Product {
    
    // Field variable
    protected double regularPrice;
    
    // Constructors
    Product () {}
    Product (double rP) {
        this.setRegularPrice(rP);
    }
    
    // Abstact Method computeSalePrice
    public abstract double computeSalePrice();
    
    // Getters and Setters
    double getRegularPrice () {
        return regularPrice;
    }
    
    void setRegularPrice(double rP) {
        regularPrice = rP;
    } 
}

// Child Class Book
class Book extends Product {
    
    // Field Variables
    protected String publisher;
    protected int yearPublished;
    
    // Constructors
    Book (double rP,String pub,int yP) {
        super(rP);
        setPublisher (pub);
        setYearPublished (yP);
    }
    
    // computeSalesPrice function
    @Override
    public double computeSalePrice () {
        return super.regularPrice * 50 / 100;
    }
    
    //Setters
    void setPublisher (String pub) {
        publisher = pub;
    }
    
    void setYearPublished (int yP) {
        yearPublished = yP;
    }
    
    // Getters
    String getPublisher () {
        return publisher;
    }
    
    int getYearPublished () {
        return yearPublished;
    }
}

// Abstract mid class Electronics
abstract class Electronics extends Product {

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
    
    String getManufacturer () {
        return manufacturer;
    }
}

// Child Class MP3Player
class MP3Player extends Electronics {
    
    // Field variables
    String color;
    
    // Constructor
    MP3Player (double rP, String manf, String c) {
        super (rP, manf);
        setColor(c);
    }
    
    
    // Overridiing computeSalesPrice method
    @Override
    public double computeSalePrice() {
        return super.regularPrice * 0.9;
    }
    
    // getter and Setter
    void setColor (String c) {
        color = c;
    }
    
    String getColor () {
        return color;
    }
}

// Child Class TV
class TV extends Electronics {
    
    // Field Variables
    int size;
    
    // Constructor
    TV (double rP,String manf, int s) {
        super (rP, manf);
        size = s;
    }

    @Override
    public double computeSalePrice() {
        return super.regularPrice * 0.8;
    }
}