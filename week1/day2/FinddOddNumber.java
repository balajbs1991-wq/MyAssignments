package main.java.org.week1.day2;

public class FinddOddNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {   // checks if number is odd
                System.out.println(i);
            }
        }
    }

}