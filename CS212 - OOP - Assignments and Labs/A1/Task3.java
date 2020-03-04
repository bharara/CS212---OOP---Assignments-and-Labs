package assignment;
public class Task3 {
    
    public static void main(String[] args) {
        
        // Initilizing a boolean array
        int n = 1000 + 1;
        boolean[] prime = new boolean[n];
        
        // Setting array to all true
        for (int i=2; i<n; i++)
            prime[i] = true;
        
        // Main Algo
        for (int i=2; i<n; i++) // Outer Loop checks every num from 2 to n-1
            if (prime[i]) // Optimization: If a number is already non-prime, it's multiple wouldn't be checked
                for (int j=i*i; j<n; j+=i) // Inner Loop declear all multiples of i as false
                    prime[j] = false;
        
        // Prints all i's that are still true
        for (int i=2; i<n; i++)
            if (prime[i])
                System.out.println(i);
                
    }
}
