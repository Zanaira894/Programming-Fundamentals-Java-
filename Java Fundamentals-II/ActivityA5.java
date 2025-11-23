import java.util.Scanner;
     public class ActivityA5{
        public static void main(String[] args){
          Scanner input= new Scanner(System.in);
          
          System.out.print("Enter the total amount milk produced(liters):");
          double milkliters= input.nextDouble();
          final double CARTON_CAPACITY = 3.78;
          final double COST_PER_LITER= 0.38;
          final double PROFIT_PER_CARTON= 0.27;
 
          int cartons= (int)(milkliters/CARTON_CAPACITY);
          double cost= milkliters*COST_PER_LITER;
          double profit= cartons*PROFIT_PER_CARTON;
      
          System.out.println("milk produced:" + milkliters + "liters");
          System.out.println("Cartons needed:" + cartons);
          System.out.println("Cost of producing milk:$" + cost);
          System.out.println("PROFIT:$"+ profit);
          input.close();
       }
    }
     