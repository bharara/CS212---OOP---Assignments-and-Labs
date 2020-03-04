
import java.io.*;

public class FileMatch {
    
    static String transPath = "D:\\2- OOP\\Assignment\\Assignment3\\trans.txt";
    static String oldMast = "D:\\2- OOP\\Assignment\\Assignment3\\oldmast.txt";
    static String newMast = "D:\\2- OOP\\Assignment\\Assignment3\\newMast.txt";
    
    public static void main (String[] args) throws FileNotFoundException, IOException {
        
        FileReader fr2 = new FileReader (oldMast);
        BufferedReader br2 = new BufferedReader(fr2);
        FileWriter fw = new FileWriter (newMast);
        BufferedWriter bw = new BufferedWriter (fw);
        
        
        String d;
        while ((d = br2.readLine()) != null) {
            String[] data = d.split("\t ");
            
            AccountRecord ar = new AccountRecord();
            ar.account = Integer.parseInt(data[0]);
            ar.fName = data[1];
            ar.lName = data[2];
            ar.balance = Double.parseDouble(data[3]);
            
            bw.write(ar.account + "\t " + ar.fName + "\t " + ar.lName + "\t " + (ar.balance+n(ar)));
            bw.newLine();
            bw.flush();
        }
    }
    
    static double n (AccountRecord ar) throws FileNotFoundException, IOException {
        
        FileReader fr = new FileReader (transPath);
        BufferedReader br = new BufferedReader (fr);
        
        String d;
        while ((d = br.readLine()) != null) {
            String[] data = d.split("\t");
            
            int n;
            if (Integer.parseInt(data[0]) == ar.account)
                return ar.balance+Double.parseDouble(data[1]);
            
        }
        return 0;
    }
}
