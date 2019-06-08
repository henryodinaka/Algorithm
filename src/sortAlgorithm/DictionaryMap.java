package sortAlgorithm;//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictionaryMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String ,Integer> dictionary = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            System.out.println(name+" "+phone);
            dictionary.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
//            dictionary.forEach((k,v) -> {
//                if (k.equals(s))
//                    System.out.println(k+" "+v);
//
//                else
//                    if (!k.equalsIgnoreCase(s))
//                    System.out.println("Not found");
//            });

           /* String item = null;
            for (Map.Entry<String ,Integer> dic : dictionary.entrySet()){
                if (dic.getKey().equalsIgnoreCase(s)){
                    item = (dic.getKey()+" "+dic.getValue());
                    break;
                }

            }
            if (item == null)
                System.out.println("Not found");
            else System.out.println(item);*/

           if (dictionary.containsKey(s))
               System.out.println(s + " " + dictionary.get(s));

           else System.out.println("Not found");
        }

        in.close();
    }
}
