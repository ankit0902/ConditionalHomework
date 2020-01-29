import java.util.Arrays;

//Question 1
public class NumericArreyStringArrey
{
    public static void main(String[] args) {
        int[] arraydata1 = {10,4,5,6,2,3,1,7,8,9}; //integer array random numbers
        String[] arraydata2= {"Frank", "Alex", "Chris", "Boris", "Danny", "Erek"}; // String random alphabet
        System.out.println("Numeric array:" + Arrays.toString(arraydata1)); //codes for random numbers array
        Arrays.sort(arraydata1);
        System.out.println("Sort Number: "+Arrays.toString(arraydata1)); // codes for sorted numbers array
        System.out.println("Random Name:"+ Arrays.toString(arraydata2)); // codes for random name array
        Arrays.sort(arraydata2);
        System.out.println("Sorted Name: " + Arrays.toString(arraydata2)); // codes for sorted name array
    }
}
