import java.util.Scanner;
import java.util.Calendar;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);

        int firstDay = cal.get(Calendar.DAY_OF_WEEK);

        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\n " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.ENGLISH) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

  
        for (int i = 1; i < firstDay; i++) {
            System.out.print(" ");
         }
     
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay - 1) % 7 == 0) 
                System.out.println();
        }
        System.out.println();
    }
}