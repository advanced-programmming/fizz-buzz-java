package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    fizzBuzz(n);
    }

    public static void fizzBuzz(int n){
        for (int i = 0; i < n; i++){
            printResult(i + 1);
        }
    }

    private static void printResult(int n){
        String result =  "";
        if (n % 3 == 0 && n % 5 == 0)
            result = "FizzBuzz";

        if (n % 3 == 0 && n % 5 != 0)
            result = "Fizz";

        if (n % 3 != 0 && n % 5 == 0)
            result = "Buzz";

        if (n % 3 != 0 && n % 5 != 0)
            result = n + "";

        System.out.println(result);
    }
}
