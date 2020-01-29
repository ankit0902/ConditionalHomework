import java.util.Scanner;

//Question 3
public class SpecificValue {

        public static void main(String[] args)
        {
            int[] arraynumbers = {1};

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            for (int x = 0; x < arraynumbers.length; x++)
            {
                if (arraynumbers[x] == num)
                {
                    System.out.println("Value exists in array!");
                }else{
                    System.out.println("Value doesn't exists in array!");
                }
            }

        }
}
