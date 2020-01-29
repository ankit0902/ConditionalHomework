import java.util.Scanner;
// Question 9

public class StringandCount { // Class Name
    public static void main(String[] args) //Main Method
    {
        String str = " ";
        int count =0;
        Scanner scanner=new Scanner(System.in);
        System.out.print( "Enter any sentence :-"); //Print Function
        str=scanner.nextLine(); //string character counts
        for (int i = 0; i <str.length() ; ++i) // Method to find specific string
        {
            switch (str.charAt(i))
            {
                case 'a':
                case 'A':
                    count++;
            }
        }
        System.out.println( "The total number of 'a' in the string are :"+ count);
    }
}

