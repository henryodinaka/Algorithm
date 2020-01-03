package sortAlgorithm;

import java.util.*;

import static java.util.Comparator.comparing;

public class TestinG {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.isAlive());
    }
}
class Person{
    private String name;

    public String getName() {
        return name;
    }
}