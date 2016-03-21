package com.javarush.test.level18.lesson10.home05

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

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
            for(int i = 0; i < b.length; i++) {
                b[i] = String.valueOf(Math.round(Double.parseDouble(b[i])));
                writeFile.write(b[i] + " ");
            }
        }
        
        reader.close();
        scanner.close();
        writeFile.close();
    }
}
