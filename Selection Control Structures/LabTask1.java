public class LabTask1{
  public static void main(String[] args){
    int x=10, y= 15, z=20;

    System.out.println("!(x>10):" + (!(x>10)? "True." : "False."));
    System.out.println("x <= 5 ||y < 15:" + (x <= 5 || y < 15? "True." : "False."));
    System.out.println("(x!=5) && (y !=z):" +  ((x!=5) && (y !=z)? "True." : "False."));
    System.out.println("x>=z || (x+y>=z):" + (x>=z || (x+y>=z)? "True." : "False."));
    System.out.println("(x <= y-2) && (y >= z):" + ((x <= y-2) && (y >= z)? "True." : "False."));
  }
}
