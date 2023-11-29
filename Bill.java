import java.util.Scanner;

class ElectricityBill 
{
    int consumerNo;
    String consumerName;
    int previousMonthReading;
    int currentMonthReading;
    int totalUnits;
    

    void readData()
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Consumer No.: ");
        consumerNo = sc.nextInt();
        System.out.print("Enter Consumer Name: ");
        consumerName = sc.next();
        System.out.print("Enter Previous Month Reading: ");
        previousMonthReading = sc.nextInt();
        System.out.print("Enter Current Month Reading: ");
        currentMonthReading = sc.nextInt();
        totalUnits = currentMonthReading - previousMonthReading;
    }

    void printData() 
{
        System.out.println("Consumer Details:");
        System.out.println("\tConsumer No.: " + consumerNo);
        System.out.println("\tConsumer Name: " + consumerName);
        System.out.println("\tTotal Units Consumed: " + totalUnits);
        System.out.println("\tBill Amount: Rs. " + calculateBillAmount());
    }

    double calculateBillAmount() 
{
        double billAmount = 0.0;
        if(totalUnits <= 100) {
            billAmount = totalUnits * 2.5f;
        }
        else if(totalUnits > 100 && totalUnits <= 200) {
            billAmount = 100 * 2.5f + (totalUnits - 100) * 3.0f;
        }
        else if(totalUnits > 200 && totalUnits <= 300) {
            billAmount = 100 * 2.5f + 100 * 3.0f + (totalUnits - 200) * 4.0f;
        }
        else {
            billAmount = 100 * 2.5f + 100 * 3.0f + 100 * 4.0f + (totalUnits - 300) * 5.0f;
        }
        return billAmount;
    }
}

public class Bill {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.readData();
        eb.printData();
    }
}
