package lab7;

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
