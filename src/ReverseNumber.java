import java.util.Scanner;

public class ReverseNumber { //Class Name

    //Question 5
        public static void main(String args[]) //Main Method
        {
            int n, reverse = 0;

            System.out.println("Enter an integer to reverse number: "); //
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            while(n != 0) //function for the reverse numbers
            {
                reverse = reverse * 10;
                reverse = reverse + n%10;
                n = n/10;
            }

            System.out.println("Reverse of the number is: " + reverse);
        }
}