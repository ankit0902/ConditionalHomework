import com.sun.deploy.security.SelectableSecurityManager;

import javax.swing.*;
import java.util.Scanner;

//Question 4
public class Digit { //Class Name

    public static void main(String[] args) { // Main Method
        int n, sumE = 0, sumO = 0;
        Scanner scanner = new Scanner(System.in); //Scanner Function
        System.out.println("Enter the number");
        n = scanner.nextInt();
        int[]a = new int[n];
        System.out.println("Enter the number");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of Even Number:" + sumE);
        System.out.println("Sum of Odd Number: " + sumO);
    }
}

