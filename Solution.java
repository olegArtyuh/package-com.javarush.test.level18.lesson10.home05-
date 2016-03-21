package com.javarush.test.level18.lesson10.home05

import java.io.*;
import java.util.Scanner;

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

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner fileR = new Scanner(new File(reader.readLine()));                    
        FileWriter fileW = new FileWriter(new File(reader.readLine()));               

        while (fileR.hasNext()) {
            String[] num = fileR.nextLine().split(" ");                               
            for (int i = 0; i < num.length; i++) {
                num[i] = String.valueOf(Math.round(Double.parseDouble(num[i])));
                fileW.write(num[i] + " ");
            }
        }
        reader.close();
        fileR.close();
        fileW.close();
    }
}
