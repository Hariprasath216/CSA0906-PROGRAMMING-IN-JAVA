import java.util.*;

class SimpleInterest{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = s.nextDouble();
        
        System.out.print("Enter the time (in years): ");
        double time = s.nextDouble();
        
        System.out.print("Are you a senior citizen (yes/no)? ");
        String seniorCitizenStatus = scanner.next();
        
        double rateOfInterest;
        
        if (seniorCitizenStatus.equalsIgnoreCase("yes")) {
            rateOfInterest = 0.12; 
        } else {
            rateOfInterest = 0.10; 
        }
        
        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);
        
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time);
    }
}
