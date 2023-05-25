
//WAP to find the duplicates present in an array.
import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        //Asking for user input for array

        System.out.println("Enter the size of The array:");
        Scanner scan1 = new Scanner(System.in);
        int[] ar1 = new int[scan1.nextInt()];
        
        System.out.println("Enter the elements of The array:");
        for (int i = 0; i < ar1.length; i++) {
            
            Scanner scan = new Scanner(System.in);
            ar1[i]=scan.nextInt();
        }

        //Checking for duplicates
        boolean flag=false;
        int length=ar1.length;

        for(int i=0;i<length-1;i++) {
            for (int j = i+1; j < ar1.length; j++) {
                if (ar1[j]==ar1[i]) {
                    flag=true;
                    System.out.println("Duplicates of Number:-  "+ ar1[i] +" present at index:- "+ i + " and " + j  );
                }
            }
        }
        if (!flag) 
            System.out.println("Duplicates are not present");
    }
}