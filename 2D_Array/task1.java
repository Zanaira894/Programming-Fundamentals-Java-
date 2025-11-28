import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        int[][] array= new int[3][4];
        for(int i= 0;i<3;i++){
            System.out.println("Enter array elements of row " + (i+1));
            for(int j=0; j<4;j++){
                array[i][j]= input.nextInt();
            }
        }
        System.out.println("The given 2D array is..... ");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            System.out.printf("%3d",array[i][j]);
            System.out.println();
        }
        int maxRowSum=0;
        int maxRowIndex=0;
        for(int i=0;i<3;i++){
           int  sum=0;
            for(int j=0;j<4;j++){
                sum+=array[i][j];}
        if (sum>maxRowSum){
            maxRowSum=sum;
            maxRowIndex=i;
        }
    }
    int maxColSum=0;
        int maxColIndex=0;
        for(int j=0;j<4;j++)
        {
           int  sum=0;
            for(int i=0;i<3;i++){
                sum+=array[i][j];}
        if (sum>maxRowSum){
            maxColSum=sum;
            maxColIndex=j;
        }
    }
    System.out.println("Row with maximum sum is row " + ( maxRowIndex+1) + "= " + maxRowSum);
            System.out.println("Column with maximum sum is column " + ( maxColIndex+1) + "= " + maxColSum);

        input.close();
    }
    
}
