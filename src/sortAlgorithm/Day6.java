package sortAlgorithm;
import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Day6. */
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        sc.nextLine();
        String[] word = new String[input];

        for (int i = 0;i < input; i++){
            word[i] =sc.nextLine();
        }
        StringBuilder evenIndexed = new StringBuilder();
        StringBuilder oddIndexed = new StringBuilder();

        for(int i = 0; i < word.length; i++)
        {

            if (word[i].length() !=1) {
                for (int j = 0; j < word[i].length(); j++) {

                    if (j % 2 == 0)
                        evenIndexed.append(word[i].toCharArray()[j]);

                    if (j % 2 == 1)
                        oddIndexed.append(word[i].toCharArray()[j]);
                }
            }
            System.out.println(evenIndexed.toString()  +" "+oddIndexed.toString() );
            evenIndexed.setLength(0);
            oddIndexed.setLength(0);

        }
    }
}

