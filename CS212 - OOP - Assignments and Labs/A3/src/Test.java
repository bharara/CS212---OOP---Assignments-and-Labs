
import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String FILE_PATH = "D:\\2- OOP\\Assignment\\Assignment3\\oldmast.txt";
        
        FileReader fr = new FileReader (FILE_PATH);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter (FILE_PATH);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("100\t Alan\t Jones\t 348.17");
        bw.newLine();
        bw.write("300\t Mary\t Smitch\t 27.19");
        bw.newLine();
        bw.write("500\t Sam\t Sharp\t 0.00");
        bw.newLine();
        bw.write("700\t Suzy\t Green\t -14.22");
        bw.newLine();
        bw.flush();
        bw.close();
        
        FILE_PATH = "D:\\2- OOP\\Assignment\\Assignment3\\trans.txt";
        
        fr = new FileReader (FILE_PATH);
        br = new BufferedReader(fr);
        fw = new FileWriter (FILE_PATH);
        bw = new BufferedWriter(fw);
        
        bw.write("100\t 27.14");
        bw.newLine();
        bw.write("300\t 62.11");
        bw.newLine();
        bw.write("400\t 100.56");
        bw.newLine();
        bw.write("900\t 82.17");
        bw.newLine();
        bw.flush();
        bw.close();
    
    }
    
}
