package lab7;

interface RelationInterface {
    
    boolean isGreater (Line a, Line b);
    boolean isLess (Line a, Line b);
    boolean isEqual (Line a, Line b);
}

public class Line implements RelationInterface {
    
    double x1, x2, y1, y2;
    
    Line (double a, double b, double c, double d) {
        x1 = a;
        x2 = b;
        y1 = c;
        y2 = d;
    }
    
    double getLength() {
        return Math.pow (Math.pow(x1-x2,2) + Math.pow(y1-y2,2), 0.5);
    }
    
    public boolean isGreater(Line a, Line b) {
        return a.getLength() > b.getLength();
    }
    
    public boolean isLess(Line a, Line b) {
        return a.getLength() < b.getLength();
    }
    
    public boolean isEqual(Line a, Line b) {
        return a.getLength() == b.getLength();
    }
    
}
