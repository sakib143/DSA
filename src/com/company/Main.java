package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isPrimeForInteger(int number) {
        if(number < 2) {
            return false;
        }
        for (int i = 2; i < number; i ++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeForLong(long number) {
        if(number < 2) {
            return false;
        }
        for (long i = 2; i < number; i ++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
//        long inputNumber = scanner.nextLong();

        long startTime = System.nanoTime();
        System.out.println(isPrimeForInteger(inputNumber));
//        System.out.println(isPrimeForLong(inputNumber));

        //Beow is used to calculate excuting time.
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("Time: %.4fs", (totalTime / 1000000000.0)); // print execution time
        scanner.close();
    }
}
/* Below are prime numbers using Integer variable
    7 -->           0.0002s,  0.0003s
    101  -->        0.0002s,  0.0002s
    103703  -->     0.0020s,  0.0021s
    1000000007  --> 2.9375s,  2.8652s
 */

/* Below are prime numbers using Long variable
    7 -->           0.0002s, 0.0003s
    101  -->        0.0002s, 0.0002s
    103703  -->     0.0034s, 0.0034s
    1000000007  --> 9.2971s, 9.8205s
    32416190039
 */
