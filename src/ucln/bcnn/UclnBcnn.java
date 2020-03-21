package ucln.bcnn;

import java.util.Scanner;

public class UclnBcnn {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = sc.nextInt();
        System.out.println("Enter number b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int least_common = a*b;

        if ( a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
        System.out.println("Least common multiple: " + least_common/a);
    }
}
