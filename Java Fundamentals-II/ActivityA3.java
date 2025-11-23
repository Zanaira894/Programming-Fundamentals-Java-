import java.util.Scanner;
    public class ActivityA3{
        public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of students in classA");
        int classA= input.nextInt();

        System.out.print("Enter the number of students in classB");
        int classB= input.nextInt();
        
        System.out.print("Enter the number of students in classC");
        int classC= input.nextInt();


        int desks= (classA + 1)/2 + (classB + 1)/2 + ( classC + 1)/2;
        System.out.println("Total desks are" + desks);
        input.close();
     }
}
        
