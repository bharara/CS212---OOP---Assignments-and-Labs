package Activity;

class AA {
    public AA() {
        System.out.println( "A's constructor is invoked");
    }
}

class BB extends AA {
    public BB(int t) {
        System.out.println( "B's constructor is invoked");
    }
}

public class Activity2 {
    public static void main( String[] args) {
        BB b = new BB(3);
    }
}
