/* A vampire number has an even number of digits and is formed by
multiplying a pair of numbers containing half the number of digits of the result. The digits
are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
Examples include:
1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81
Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.) */
package com.company;

public class Main {

    public static void main(String[] args) {
        for (Integer vampire : new Vampire().findVampireNum()) {
            System.out.print(vampire + " ");
        }
    }
}
