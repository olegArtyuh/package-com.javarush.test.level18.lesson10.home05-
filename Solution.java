import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new File(reader.readLine()));
        FileWriter writeFile = new FileWriter(new File(reader.readLine()));


        while(scanner.hasNext()) {
            String[] b = scanner.nextLine().split(" ");
            for(int i = 0; i < b.length; i++)
            {
                b[i] = String.valueOf(Math.round(Double.parseDouble(b[i])));

                writeFile.write(b[i] + " ");
      
        }

        reader.close();
        scanner.close();
        writeFile.close();


    }
}
