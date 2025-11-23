import java.util.Scanner;

public class LabTask6 {
    public static String capitalize(String lower_case_word) {
        if (lower_case_word.length() == 0)
            return lower_case_word;
        return lower_case_word.substring(0, 1).toUpperCase() + lower_case_word.substring(1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lowercase words separated by space: ");
        String line = input.nextLine();
        String[] words = line.split(" ");
        for (String word : words) {
            System.out.print(capitalize(word) + " ");
}
}
}
