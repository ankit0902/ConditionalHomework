import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

//Question 6
public class ArmstrongNumber { //To check 3 digit if it's Armstrong number or not

    public static void main(String[] args) { //main method
        int num, number, temp, total =0;
        Scanner scanner = new Scanner(System.in); // scanner function
        System.out.println("Enter any 3 digit number:");
        num=scanner.nextInt();
        scanner.close();
        number = num;
        for (;number!=0; number/=10)
        {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        if (total == num) {
            System.out.println(num + ":is an Armstrong Number"); // print out function
        }
            else
            {System.out.println(num + ": is not an Armstrong number"); // print out function
        }

    }
}
