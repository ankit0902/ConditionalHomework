import java.util.Scanner;

public class FibonacciNumber { //Class Name
    //Question 8
    public static void main(String[] args) //Main Method
    {

        int n, first = 0,next = 1;

        System.out.println("Enter how may fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in); // scanner function
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        int i = 1;
        while (i<n-1)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }

    }
}
