package lab7;
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