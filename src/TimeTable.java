import java.util.Scanner;

//Question 7
public class TimeTable { //Class Name
    public static void main(String[] args) { //Main Method

        int i, j;
        Scanner scanner = new Scanner(System.in); //Main Method

        System.out.println("Please Enter any number for timetable"); //Print Function
        i = scanner.nextInt();
        while (i <=10) {
            j = 1;

            while (j <=10){
                System.out.println(i + " * " + j + " = " + i * j);
                i++;
            }
        }

    }
}
