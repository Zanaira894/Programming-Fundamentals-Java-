import java.util.*;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  
        String[] words = input.split(" ");
        System.out.println(words[1] + " " + words[0]);
}
}
