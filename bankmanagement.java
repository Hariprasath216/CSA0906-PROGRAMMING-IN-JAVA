class Bank {
    // Method to get the rate of interest
    double getRateOfInterest() {
        return 8.4; // Default rate of interest
    }
}

class SBI extends Bank {
    // Override method to get the rate of interest for SBI
    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    // Override method to get the rate of interest for ICICI
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class AXIS extends Bank {
    // Override method to get the rate of interest for AXIS
    @Override
    double getRateOfInterest() {
        return 9.0;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects for each bank
        Bank bank = new Bank();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        // Display the rate of interest for each bank
        System.out.println("Rate of Interest for Bank: " + bank.getRateOfInterest() + "%");
        System.out.println("Rate of Interest for SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest for ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of Interest for AXIS: " + axis.getRateOfInterest() + "%");
    }
}
