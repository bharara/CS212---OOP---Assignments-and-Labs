package Activity;

class A {
    public A() {
        System.out.println( "A's no-arg constructor is invoked");
    }
}

class B extends A {}

public class Activity1 {
    public static void main( String[] args) {
        B b = new B();
    }
}
