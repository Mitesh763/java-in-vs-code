// import java.util.*;

// // binary to desimal convert with exception

// public class Clg_22_Bin2Desi {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Binary Number : ");
//         String str = sc.next();

//         System.out.println("Original binary number  : " + str);
//         double sum = 0;

//         String reverseSTR = new StringBuilder(str).reverse().toString();
//         System.out.println(" reverse binary number : " + reverseSTR);

//         char[] strArray = reverseSTR.toCharArray();

//         for (int i = 0; i < str.length(); i++) {
//             // System.out.println(" B : " + sum);
//             sum = sum + (strArray[i] * Math.pow(2.0, i));
//             // System.out.println("strarray : " + strArray[i]);
//             // System.out.println("math: " + Math.pow(2.0, i));
//             // System.out.println("multiply : " + (strArray[i] * Math.pow(2, i)));
//             // System.out.println(" A : " + sum);
//         }

//         System.out.println("DECIMAL : " + sum);

//     }
// }

public class Clg_22_Bin2Desi {
    public static int bin2Dec(String binaryString) {
        if (!isBinaryString(binaryString)) {
            throw new NumberFormatException("Invalid binary string: " + binaryString);
        }

        int decimal = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            int bit = binaryString.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }

    private static boolean isBinaryString(String binaryString) {
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String binaryString = "101010";
        int decimalNumber = bin2Dec(binaryString);
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalNumber);

        // Testing with invalid binary string
        String invalidBinaryString = "10102";
        try {
            int invalidDecimalNumber = bin2Dec(invalidBinaryString);
            System.out.println("Binary: " + invalidBinaryString);
            System.out.println("Decimal: " + invalidDecimalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
