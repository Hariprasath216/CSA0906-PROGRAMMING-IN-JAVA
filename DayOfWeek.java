import java.util.*;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the day: ");
        int day = s.nextInt();

        System.out.print("Enter the month: ");
        int month = s.nextInt();

        System.out.print("Enter the year: ");
        int year = s.nextInt();
        s.close();
        LocalDate date = LocalDate.of(year, month, day);
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("The day of the week is: " + dayOfWeek);
    }
}