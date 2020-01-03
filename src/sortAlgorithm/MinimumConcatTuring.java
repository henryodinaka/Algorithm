package sortAlgorithm;

import java.util.*;

public class MinimumConcatTuring {
    public static int minimumConCat(String initial, String goal) {
        char[] initChar = initial.toCharArray();
        int n = initChar.length;
        List<String> subSet = new ArrayList<>();
        List<String> concatWord = new ArrayList<>();
        StringBuilder goalBuilder = new StringBuilder(goal);

        for (int i = 0; i < (1 << n); i++) {
            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0) {
                    builder.append(initChar[j]);
                    subSet.add(builder.toString());
                }
        }
        Collections.sort(subSet, Comparator.comparing(String::length));
        Collections.reverse(subSet);
        boolean exist = false;
        for (String s : subSet) {
            int length = s.length();
            if (goalBuilder.length()<1) break;
            String substring = goalBuilder.substring(0, length);
            exist = false;
            if (substring.equals(s) && (!substring.equals(""))) {
                exist = true;
                for (String sub : subSet) {
                    if (length < 1) break;
                    if (sub.length() > goalBuilder.length()) continue;
                    String string = goalBuilder.substring(0, sub.length());
                    if (string.equals(sub)) {
                        substring = string;
                        length = sub.length();
                        concatWord.add(sub);
//                        System.out.println("Substring : " + substring + " Subset : " + sub);
                        goalBuilder.delete(0, length);
//                        System.out.println("Remaining : " + goalBuilder);
                        break;
                    }
                }
            }
        }

        return exist ? concatWord.size() : -1;
    }

    public static void main(String[] args) {
        int minimumConCat = minimumConCat("abc", "bcbac");
        System.out.println("The minimunConcat : " + minimumConCat);
    }
}
