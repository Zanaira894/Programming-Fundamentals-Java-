import java.util.*;

public class LabTask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        int first = str.indexOf('h');
        int last = str.lastIndexOf('h');

        StringBuilder sb = new StringBuilder(str);
        for (int i = first + 1; i < last; i++) {
            if (sb.charAt(i) == 'h') {
                sb.setCharAt(i, 'H');
            }
        }
        System.out.println(sb.toString());
}
}
