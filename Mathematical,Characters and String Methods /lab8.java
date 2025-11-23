import java.util.Scanner;
public class lab8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();      

        int first = str.indexOf('h');
        int last = str.lastIndexOf('h');

        if(first != -1 && last != -1 && first != last){
          String before= str.substring(0,first);
          String after= str.substring(last+1); 
          String result= before + after;
          System.out.println("Correct Answer:" + result);}
        else{
         System.out.println("The string must contain at least two 'h' letters!");}
}
}
