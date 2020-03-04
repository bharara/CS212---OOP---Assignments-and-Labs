package assignment;
import java.util.Scanner;

public class Task4 {     
    public static void main(String[] args) {
        
        // Declearing scanner object
        Scanner input = new Scanner(System.in);
        
        // Inputing array size and probability
        System.out.println("Enter Array size");
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.println("Enter Probability (between 0 and 1)");
        float p = input.nextFloat();
        
        // Intlizing a boolean variable
        boolean[][] bomb = new boolean[m+2][n+2];
        
        // Inserting bomb
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                bomb[i][j] = (Math.random() < p); // For every [i][j] slot; a bomb can be inserted randomly 

        // Printing the Deck with * as bomb and . as not
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                if (bomb[i][j])
                    System.out.print(" *");
                else
                    System.out.print(" .");
            
            System.out.println();
        }

        // Loops check each variables 8 accopning cells and count the number of bombs
        // Bombs are inserted into accompnining positons in array distance
        int[][] distance = new int[m+2][n+2];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                for (int x = i - 1; x <= i + 1; x++)
                    for (int y = j - 1; y <= j + 1; y++)
                        if (bomb[x][y])
                            distance[i][j]++;

        // Printing the deck with distances
        System.out.println();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (bomb[i][j])
                    System.out.print(" *");
                else
                    System.out.print(" "+distance[i][j]);
            }
            System.out.println();
        }

    }
}
