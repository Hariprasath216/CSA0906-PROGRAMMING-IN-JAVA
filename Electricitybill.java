import java.util.Scanner;

public class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;

    public ElectricityBill(int consumerNo, String consumerName, int prevMonthReading, int currMonthReading) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
    }

    public float calculateBillAmount() {
        int unitsConsumed = currMonthReading - prevMonthReading;
        float billAmount = 0;

        if(unitsConsumed <= 100) {
            billAmount = unitsConsumed * 2.5f;
        }
        else if(unitsConsumed > 100 && unitsConsumed <= 200) {
            billAmount = 100 * 2.5f + (unitsConsumed - 100) * 3.0f;
        }
        else if(unitsConsumed > 200 && unitsConsumed <= 300) {
            billAmount = 100 * 2.5f + 100 * 3.0f + (unitsConsumed - 200) * 4.0f;
        }
        else {
            billAmount = 100 * 2.5f + 100 * 3.0f + 100 * 4.0f + (unitsConsumed - 300) * 5.0f;
        }

        return billAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter consumer number: ");
        int consumerNo = scanner.nextInt();

        System.out.print("Enter consumer name: ");
        String consumerName = scanner.next();

        System.out.print("Enter previous month reading: ");
        int prevMonthReading = scanner.nextInt();

        System.out.print("Enter current month reading: ");
        int currMonthReading = scanner.nextInt();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, prevMonthReading, currMonthReading);

        System.out.println("Consumer Number: " + bill.consumerNo);
        System.out.println("Consumer Name: " + bill.consumerName);
        System.out.println("Previous Month Reading: " + bill.prevMonthReading);
        System.out.println("Current Month Reading: " + bill.currMonthReading);
        System.out.println("Bill Amount: Rs." + bill.calculateBillAmount());

        scanner.close();
    }
}