package check.prime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number < 2)
            System.out.println(number + " is a not Prime");
        else {
            int i = 2;
            boolean checkPrime = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    checkPrime = false;
                    break;
                }
                i++;
            }
            if (checkPrime)
                System.out.println(number + " is a Prime");
            else
                System.out.println(number + " is not a Prime");
        }

    }
}
