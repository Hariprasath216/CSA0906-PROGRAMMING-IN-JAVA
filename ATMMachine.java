import java.util.Scanner;

 class ATMMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] denominations = {2000, 500, 200, 100};

        
        int totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            int denomination = scanner.nextInt();

           
            if (denomination != denominations[i]) {
                System.out.println("Invalid denomination. Please enter the correct denomination.");
                i--; // Retry the current iteration
                continue;
            }

            System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
            int numberOfNotes = scanner.nextInt();

            totalAmount += denomination * numberOfNotes;
        }

       
        System.out.println("Total Amount in ATM Machine: " + totalAmount);
    }
}
