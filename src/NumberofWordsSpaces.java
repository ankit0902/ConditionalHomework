import java.util.Scanner;

public class NumberofWordsSpaces { // Class Method

    public static void main(String[] args) { //Main Method
        Scanner scanner = new Scanner(System.in); // scanner function
        System.out.println("Enter your sentence");
        String str = scanner.nextLine();
        int word = 1;

        for ( int i = 0; i< str.length(); i++)
        {
            if (str.charAt(i)==' ') //
                word++;
        }
        System.out.println("Number of words:" +word); //print numbers of words
        System.out.println("Number of space:" +(word-1)); //print numbers of spaces
    }
}
