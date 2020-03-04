package assignment;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        
        // Creating Scanner object
        Scanner input = new Scanner(System.in);
        
        // Declearing array
        System.out.println("What would be the size of array");
        int size = input.nextInt();
        int[] arry = new int[size];
        
        // Intilizing Array
        for (int i=0; i<size; i++) {
            System.out.println(1+i+": ");
            arry[i] = input.nextInt();
        }
        
        // Declearing border variables
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        // Finding maximum and minimum value
        for (int value : arry) {
            if (value > max)
                max = value;
            if (value < min )
                min = value;
        }
        
        // Printing values and their difference
        System.out.println("Maximum Value is "+max);
        System.out.println("Maximum Value is "+min);
        System.out.println("Diffrence is "+(max-min));
    }
}
