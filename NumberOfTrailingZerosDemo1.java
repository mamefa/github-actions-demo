import java.util.Scanner;

public class NumberOfTrailingZerosDemo {

    public static void main(String[] args) {
        try {
    		System.out.println("Enter the number ");
    		Scanner sc = new Scanner(System.in);
    		int i = sc.nextInt();
    		System.out.println("Binary representation is = " + Integer.toBinaryString(i));
    		System.out.println("Number of trailing zeros is " + Integer.numberOfTrailingZeros(i));
			} catch (Exception e) {
    		System.out.println("Invalid input");
		}

	}
}
