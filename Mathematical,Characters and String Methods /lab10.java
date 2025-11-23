import java.util.*;
public class lab10{
  public static void main(String[]args){
  Scanner sc= new String(System.in){
  String s= sc.nextLine();
  System.out.println(s.charAt(2));

  System.out.println(s.charAt(s.length()-2));

  System.out.println(s.substring(0,5));

  System.out.println(s.substring(0,s.length()-2));

  for(i = 0 ; i < s.length(); i+=2)
   System.out.println(s.charAt(i));
   System.out.println();

  for(i = 1 ; i < s.length(); i+=2)
   System.out.println(s.charAt(i));
   System.out.println();

  for(i = s.length()-1; i>=0 ;i--)
   System.out.println(s.charAt(i));
   System.out.println();
   
  for(i = s.length()-1; i>=0 ;i -= 2)
   System.out.println( s.charAt(i));
   System.out.println();
  
  
  System.out.println( s.length());
}
} 
