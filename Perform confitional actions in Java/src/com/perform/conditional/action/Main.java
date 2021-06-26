/*  TASK
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes.
Given an integer, n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
A single line containing a positive integer, n.

Constraints
1 <= n <= 100

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

(Comment: This is for educational purpose, learn and try to understand how it works.) */


package com.perform.conditional.action;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        String out = "";

        if (n%2==1){ out = "Weird";}
        else { if (n >= 2 && n <= 5) { out = "Not Weird"; }
        else if (n >= 6 && n <= 20) { out = "Weird"; }
        else { out = "Not Weird"; }

        }
        System.out.println(out);

    }
}
