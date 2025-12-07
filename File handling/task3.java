import java.io.*;
public class task3 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        int count = 0;

        
        try {
            FileReader fr = new FileReader("task.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                arr[count] = Integer.parseInt(line);  
                count++;
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println("Cannot read file.");
            return;
        }
        try {
            FileWriter fw = new FileWriter("task.txt");

            for (int i = 0; i < count; i++) {
                if (!isPrime(arr[i])) {
                    fw.write(arr[i] + "\n");
                }
            }

            fw.close();
            System.out.println("Prime numbers removed and file updated.");

        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}

