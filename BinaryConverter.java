import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the binary number from the user
        System.out.print("Enter the binary number: ");
        String binaryNumber = scanner.nextLine();

        // Convert and print decimal and octal representations
        convertAndPrintDecimalOctal(binaryNumber);

        scanner.close();
    }

    // Method to convert and print decimal and octal representations of a binary number
    private static void convertAndPrintDecimalOctal(String binaryNumber) {
        // Convert binary to decimal
        int decimal = Integer.parseInt(binaryNumber, 2);
        System.out.println("Decimal Number: " + decimal);

        // Convert binary to octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
    }
}
