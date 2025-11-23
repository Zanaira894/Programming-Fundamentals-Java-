import java.util.Scanner;
   public class ActivityA4{
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes that is passed since midnight");
        int N= input.nextInt();
     
        int hours= (N/60)%24;
        int minutes= N%60;
    
        System.out.println( hours + " " + minutes);
        input.close();
    }
}
