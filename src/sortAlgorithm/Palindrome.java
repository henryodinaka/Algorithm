package sortAlgorithm;

public class Palindrome {
    public static boolean isPalindrome(String word) {

        System.out.println("Initial word : "+word);
        byte [] strAsByteArray = word.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];

        String reverseWord = new String(result);
        System.out.println(reverseWord);
        if (reverseWord.toLowerCase().equals(word.toLowerCase()))
            return true;
        else return false;
    }
    public static void main(String[] args) {

        String word = "Deleveled";
        System.out.println(isPalindrome(word));
    }
}
