import java.util.Scanner;

public class IT26101426Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count+1) + "/6): ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                myArray[count] = num;
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(myArray[i] + " ");
        }

        int max = myArray[0];
        for (int i = 1; i < 6; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
        sc.close();
    }
}
        