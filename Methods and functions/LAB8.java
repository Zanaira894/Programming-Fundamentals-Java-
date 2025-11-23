import java.util.Scanner;
public class LAB8{
    public static int countVowels(String str){
    int count = 0;
    str = str.toLowerCase();

    for(int i = 0; i< str.length(); i++){
    char ch = str.charAt(i); 
    if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    count++;
    }
    }
    return count;
    }
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String userInput;
   int vowelCount;
   System.out.print("Enter a string: ");
   userInput = input.nextLine();
   vowelCount = countVowels(userInput);
   System.out.println("Number of vowels in the string: " + vowelCount );
   }
}
