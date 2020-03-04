package lab7;

// basic Interface
interface ProductInterface  {
    double computeSalePrice ();
    double getRegularPrice ();
    void setRegularPrice (double p);
}

// Main parent class
public abstract class Product implements ProductInterface {
    
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
    public double getRegularPrice () {
        return regularPrice;
    }
    
    public void setRegularPrice(double rP) {
        regularPrice = rP;
    } 
}
