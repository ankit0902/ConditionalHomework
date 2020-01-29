import java.util.Scanner;

//Question 2
public class SumValueArray {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[10]; //codes for integer value
            int sum = 0; //codes for integer sum
            System.out.println("Enter the numbers:"); //codes for results
            for (int i=0; i<10; i++) // codes "For functionality"
            {
                array[i] = scanner.nextInt();
            }
            for( int num : array)
            {
                sum = sum+num;
            }
            System.out.println("Sum value:"+sum); //codes for sum value results
        }
    }
