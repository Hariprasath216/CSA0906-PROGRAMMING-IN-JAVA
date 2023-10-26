import java.util.*;

class leapyear {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Date (dd/mm/yyyy): ");
        String date = s.nextLine();

         String[] dateParts = date.split("/");
        if (dateParts.length != 3) {
            System.out.println("Invalid date format. Please use dd/mm/yyyy.");
            
        }
        int year = Integer.parseInt(dateParts[2]);

        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is a Non Leap Year");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            
        }
        
    }
}