import java.io.*;
import java.util.*;

public class task2 {
    public static void main(String[] args) {

        int[] integers = new int[10];  

        try {
            FileReader fr = new FileReader("task.txt");
            BufferedReader br = new BufferedReader(fr);

            for (int i = 0; i < integers.length; i++) {
                String line = br.readLine();       
                integers[i] = Integer.parseInt(line);
            }

            br.close();
            Arrays.sort(integers);

            System.out.println("Sorted data:");
            for (int num : integers) {
                System.out.println(num);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

    

