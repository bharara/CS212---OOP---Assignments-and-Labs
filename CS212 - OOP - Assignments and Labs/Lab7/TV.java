package lab7;

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