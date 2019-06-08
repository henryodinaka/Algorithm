package sortAlgorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        for (int i = 0; i<arr.length; i++)
        {
            for (int j =0; j<arr.length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int result = 0;
        int counter = 0;
        int counter_i = 0;
        int lastJ =0;

        for (int n = 0; n < arr.length; n++) {

            for (int i = n; i < 3 + counter; i++) {

                for (int j = counter_i; j < 3 + counter_i; j++) {
//                    System.out.print("\nJ :"+j);
//                    System.out.println(" i :"+i);
                    System.out.print(arr[i][j] + " ");
//                    result = result + arr[i][j];
                    lastJ = j;
                }
                System.out.println();
                System.out.println("Last value of J :"+lastJ+"\n");
                if ((( arr.length - counter_i ) + 1 ) >= 3 )
                {
                    counter_i++;
//                    i =0;
                }
            }
            if ((3 + counter) < arr.length)
                counter++;
            counter_i = 0;
            System.out.println();
        }
    return result;
    }
    public static void fileWriter(){
        StringBuilder builder = new StringBuilder();

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("array.txt"));

            for (int i = 0; i < 6; i++) {

                for (int j = 0; j < 6; j++) {
                    int arrItem = scanner.nextInt();
                    builder.append(arrItem);
                    builder.append(" ");
                }
                builder.append("\n");
            }
            bufferedWriter.write(builder.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static int[][] fileReader()
    {
        try {

            int[][] arr = new int[6][6];
            BufferedReader reader = new BufferedReader(new FileReader("array.txt"));
            String line = "";
            int row = 0;

            while ((line = reader.readLine()) != null) {
                String[] cols = line.split(" "); //note that if you have used space as separator you have to split on " "
                int col = 0;
                for (String c : cols) {
                    arr[row][col] = Integer.parseInt(c);
                    col++;
                }
                row++;
            }
            reader.close();
            return arr;
        }catch (IOException e){
            return null;
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public void convert(int[][] arr){
                int n = 0;
        List<Integer> sumArray = new ArrayList<>();
        while(n < 4){
            int tempArray[] = new int[arr.length];
            // console.log('Before ', tempArray);
            for(int i = n; i <= 2 + n; i++){
                for (int j = 0; j < 3; j++){
                    tempArray[j] = arr[i][j];
                }
            }
            // console.log('Each ', tempArray);
            n++;
            int sum = 0;
            for(int t = 0; t < 9; t++){
                // console.log('Elem ', t, tempArray[t]);
                if(t != 3 && t != 5) {
                    sum += tempArray[t];
                    // console.log('Summer ', sum);
                }
            }
            sumArray.add(sum);
            if(n == 4 && arr[0].length > 3){
                n = 0;
//                arr.forEach(arr_ => {
//                        arr_.splice(0, 1);
//           })
            }
            // console.log('newArray ', arr);
        }
        // console.log('Sum Array ', sumArray);
//   const sort = sumArray.sort(function (a, b){return (b - a);});
//        return sort[0];
}

    public static void main(String[] args) throws IOException {

//fileWriter();
        int[][] arr = fileReader();

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
