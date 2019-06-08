package sortAlgorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    // Complete the reverseArray function below.
    
    static int[] reverseArray(int[] a) {
        int [] resArray = new int[a.length];
        int i = a.length-1;

           for( int j = 0;j<a.length; j++)

           {
               resArray[j] = a[i];
               i--;
           }


        return resArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("PATH")));

        int arrCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];
        scanner.nextLine();

//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {

            arr[i] = scanner.nextInt();
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
            System.out.print("\n"+res[i]);
            if (i != res.length - 1) {
//                bufferedWriter.write(" ");
                System.out.println(" ");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
