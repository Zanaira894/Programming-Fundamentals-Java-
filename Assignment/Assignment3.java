import java.util.Scanner;
import java.util.Arrays; 

public class Assignment3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Question 1: Matrix Multiplication");
            System.out.println("2. Question 2: Random 0/1 Matrix Analysis");
            System.out.println("3. Question 3: Sort a,b,c Array");
            System.out.println("4. Question 4: Array Operations Menu");
            System.out.println("5. Question 5: Smart Grid Optimization");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:System.out.println("\n---Question 1:Matrix Multiplication---");
                        matrixMultiplication(sc); break;
                case 2:System.out.println("\n---Question 2: randomMatrixAnalysis---");
                       randomMatrixAnalysis(sc); break;
                case 3: System.out.println("\n---Question 3:sortABC---");
                       sortABC(sc); break;
                case 4:System.out.println("\n---Question 4:arrayOperationsMenu---");
                       arrayOperationsMenu(sc); break;
                case 5:System.out.println("\n---Question 5:smartGridOptimization---");
                       smartGridOptimization(sc); break;
                case 6: 
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }

    // ============================================================
    //               UTILITY METHODS
    // ============================================================
      public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
      public static void printArray(int[] arr) {
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
    

    public static boolean allEqual(int[] arr, int x) {
        for (int i : arr)
            if (i != x) return false;
        return true;
    }

    // ============================================================
    //                    Q1: MATRIX MULTIPLICATION
    // ============================================================
    public static void matrixMultiplication(Scanner sc) {

        System.out.print("Enter rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols of B: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication NOT possible!");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("Resultant Matrix:");
        printMatrix(C);
    }
      

    // ============================================================
    //               Q2: RANDOM 0/1 MATRIX ANALYSIS
    // ============================================================
    public static void randomMatrixAnalysis(Scanner sc) {

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = (int)(Math.random() * 2);

        System.out.println("Generated Matrix:");
        printMatrix(m);

        boolean rowFound = false;

        for (int i = 0; i < n; i++) {
            if (allEqual(m[i], 0)) { System.out.println("All 0s on row " + i); rowFound = true; }
            if (allEqual(m[i], 1)) { System.out.println("All 1s on row " + i); rowFound = true; }
        }
        if (!rowFound) System.out.println("No same numbers on any row.");

        boolean colFound = false;

        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) col[i] = m[i][j];

            if (allEqual(col, 0)) { System.out.println("All 0s on column " + j); colFound = true; }
            if (allEqual(col, 1)) { System.out.println("All 1s on column " + j); colFound = true; }
        }
        if (!colFound) System.out.println("No same numbers on any column.");

        // Major diagonal
        int[] major = new int[n];
        for (int i = 0; i < n; i++) major[i] = m[i][i];

        if (allEqual(major, 0)) System.out.println("All 0s on major diagonal");
        else if (allEqual(major, 1)) System.out.println("All 1s on major diagonal");
        else System.out.println("No same numbers on major diagonal");

        // Sub diagonal
        int[] sub = new int[n];
        for (int i = 0; i < n; i++) sub[i] = m[i][n - 1 - i];

        if (allEqual(sub, 0)) System.out.println("All 0s on sub diagonal");
        else if (allEqual(sub, 1)) System.out.println("All 1s on sub diagonal");
        else System.out.println("No same numbers on sub diagonal");
    }
        

    // ============================================================
    //               Q3: SORT ABC
    // ============================================================
    public static void sortABC(Scanner sc) {

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        char[] arr = new char[n];
        System.out.println("Enter a/b/c:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);

        int countA = 0, countB = 0, countC = 0;

        for (char ch : arr) {
            if (ch == 'a') countA++;
            else if (ch == 'b') countB++;
            else countC++;
        }

        int idx = 0;
        for (int i = 0; i < countA; i++) arr[idx++] = 'a';
        for (int i = 0; i < countB; i++) arr[idx++] = 'b';
        for (int i = 0; i < countC; i++) arr[idx++] = 'c';

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    // ============================================================
    //               Q4: ARRAY OPERATIONS MENU
    // ============================================================
    public static void arrayOperationsMenu(Scanner sc) {

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        while (true) {

            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Count occurrences");
            System.out.println("2. Partition first element");
            System.out.println("3. Duplicate frequencies");
            System.out.println("4. Circular Sum Replace");
            System.out.println("5. Shift Left Circular by 2");
            System.out.println("6. Back");
            System.out.print("Enter choice: ");

            int c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.print("Enter x: ");
                    count(arr, sc.nextInt());
                    break;

                case 2:
                    partition(arr);
                    System.out.print("Array after partition: ");
                    printArray(arr);
                    break;

                case 3:
                    duplicates(arr);
                    break;

                case 4:
                    circular(arr);
                    System.out.print("Array after circular sum: ");
                    printArray(arr);
                    break;

                case 5:
                    shiftCircular(arr);
                    System.out.print("Array after shifting: ");
                    printArray(arr);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
      
    // Q4 Count
    public static void count(int[] arr, int x) {
        int c = 0;
        for (int v : arr) if (v == x) c++;
        System.out.println("Occurrences of " + x + ": " + c);
    }

    // Q4 Partition
    public static void partition(int[] arr) {
        int pivot = arr[0];
        int[] temp = new int[arr.length];
        int idx = 0;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] < pivot) temp[idx++] = arr[i];

        temp[idx++] = pivot;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > pivot) temp[idx++] = arr[i];

        for (int i = 0; i < arr.length; i++)
            arr[i] = temp[i];
    }

    // Q4 Duplicates
    public static void duplicates(int[] arr) {
        boolean[] vis = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (vis[i]) continue;

            int c = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    vis[j] = true;
                    c++;
                }
            }

            System.out.println(arr[i] + " occurs " + c + " times");
        }
    }

    // Q4 Circular Replace
    public static void circular(int[] arr) {
        int[] old = arr.clone();
        int n = arr.length;

        for (int i = 0; i < n; i++)
            arr[i] = old[(i + 1) % n] + old[(i + 2) % n];
    }

    // Q4 Shift Circular
    public static void shiftCircular(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        int first = arr[0], second = arr[1];

        for (int i = 0; i < n - 2; i++)
            arr[i] = arr[i + 2];

        arr[n - 2] = first;
        arr[n - 1] = second;
    }

    // ============================================================
    //               Q5: SMART GRID OPTIMIZATION
    // ============================================================
    public static void smartGridOptimization(Scanner sc) {

        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] grid = new int[r][c];

        System.out.println("Enter grid:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                grid[i][j] = sc.nextInt();

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        int[][] out = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                out[i][j] = grid[i][j];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] > threshold) {

                    int sum = 0, count = 0;

                    if (i > 0)   { sum += grid[i-1][j]; count++; }
                    if (i < r-1) { sum += grid[i+1][j]; count++; }
                    if (j > 0)   { sum += grid[i][j-1]; count++; }
                    if (j < c-1) { sum += grid[i][j+1]; count++; }

                    out[i][j] = sum / count;
                }
            }
        }

        System.out.println("Optimized Grid:");
        printMatrix(out);
    }

}
