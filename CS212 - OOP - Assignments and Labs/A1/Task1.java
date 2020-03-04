package assignment;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
        // Declearing Scanner object
        Scanner input = new Scanner(System.in);
        
        // Declearing Array
        System.out.println("What would be the size of array");
        int size = input.nextInt();
        int[] arry = new int[size];
        
        // Intilizing array
        for (int i=0; i<size; i++) {
            System.out.println(1+i+": ");
            arry[i] = input.nextInt();
        }
        
        // Printing the current array
        System.out.println("Array is");
        for (int i=0; i<size; i++)
            System.out.println(arry[i]);
        
        // Sorting
        for (int i=0; i<size; i++) {
            if (arry[i]==0) // If zero is found, it is moved to the end and all other elements are moved one step forward
                for (int j=i; j<size-1; j++) {
                    int t = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = t;
                    }
        }
        
        // Print the new array
        System.out.println("Array after realocation");
        for (int j=0; j<size; j++)
            System.out.println(arry[j]);

    }
}