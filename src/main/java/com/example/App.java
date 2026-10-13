package com.example;

public class App {

    public String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        App obj = new App();

        int number = 7;

        System.out.println("Number: " + number);
        System.out.println("Result: " + obj.checkEvenOdd(number));
    }
}