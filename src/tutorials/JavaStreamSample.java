package tutorials;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamSample {
    public static void main(String[] args) throws IOException {
        differentStream();

    }

    public static void differentStream() throws IOException {
        System.out.println("========== Inter Stream ============");
        IntStream.range(1, 10).forEach(System.out::println);

        System.out.println("========== Integer Stream with skip ============");
        IntStream.range(1, 10).skip(3).forEach(x -> System.out.println(x));

        System.out.println("========== Integer Stream with sum ============");
        System.out.println(IntStream.range(1, 5).sum());

        System.out.println("========== Stream.of, sorted and findFirst ============");
        Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

        System.out.println("========== Stream from array, sort,filter and print ============");
        String[] names = {"Al", "Ankit", "Kunshal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Henry"};
        Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

        System.out.println("========== Average of squares of int array ============");
        Arrays.stream(new int[]{2,4,6,8,10}).map(x -> x*x).average().ifPresent(System.out::println);
        System.out.println("========== Stream from List, filter and print ============");
        List<String> people = Arrays.asList("Al", "Ankit", "Kunshal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Henry");
        people.stream().map(String :: toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("========== Stream rows from text file,sort, filter, and print ============");
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\odina\\Documents\\algorithm.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 100)
                .forEach(System.out::println);
        bands.close();
        System.out.println("========== Lecture 9 ============");
        List<String> bands2 = Files
                .lines(Paths.get("C:\\Users\\odina\\Documents\\algorithm.txt"))
                .filter(x -> x.contains("if"))
                .filter(x -> x.length() >100)
                .collect(Collectors.toList());
        bands2.forEach(System.out::println);
        System.out.println("========== Stream rows from CSV file and count ============");

        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\odina\\Documents\\data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .count();
        System.out.println(rowCount +" rows.");
        rows1.close();
        System.out.println("========== Stream rows from CSV file and parse data from rows ============");

        Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\odina\\Documents\\data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] +" "+x[2]));
        rows2.close();
        System.out.println("========== Stream rows from CSV file store fields in HashMap ============");

        Stream<String> rows3 = Files.lines(Paths.get("C:\\Users\\odina\\Documents\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map =rows3
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(x -> x[0],x -> Integer.parseInt(x[1])));
                rows3.close();
        for (String key : map.keySet()) System.out.println(key +" "+map.get(key));


        System.out.println("========== Reduction - sum ============");
        double total = Stream.of(7.3,1.5,4.8)
                .reduce(0.0, (Double a , Double b) -> a + b);
        System.out.println("Total = "+total);

        System.out.println("========== Reduction - summary statistics ============");
        IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
                .summaryStatistics();
        System.out.println("Summery = "+summary);

        System.out.println("========== FindFirst orElse ============");
        List<Integer> intValues = Arrays.asList(7,2,19,88,73,4,10);
        Integer result = intValues.stream().filter(i -> i < 20).findFirst().orElse(0);
        System.out.println("Result = "+result);

    }
}
