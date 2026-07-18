import java.lang.*;

public class NumberOfTrailingZerosDemo {
    public static void main(String[] args) {
            int i = 500; //2 trailing zeros

            System.out.println("Number is like : "+ i);
            System.out.println("Binary representation is = " + Integer.toBinaryString(i));
            System.out.println("Number of trailing zeros is " + Integer.numberOfTrailingZeros(i));

            int j = 456; //2 trailing zeros
            System.out.println("Number is like : "+ j);
            System.out.println("Binary representation is = " + Integer.toBinaryString(j));
            System.out.println("Number of trailing zeros is " + Integer.numberOfTrailingZeros(j));

            int k = -8; //3 leading zeros
            System.out.println("Number is like : "+ k);
            System.out.println("Binary representation is = " + Integer.toBinaryString(k));
            System.out.println("Number of zeros behind the rightmost 1-bit is " + Integer.numberOfTrailingZeros(k));
    }
}
