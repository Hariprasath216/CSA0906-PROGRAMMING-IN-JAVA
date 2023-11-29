import java.util.Scanner;

 class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the upper limit (b): ");
        int b = scanner.nextInt();

        System.out.println("Composite numbers between " + a + " and " + b + ":");

        for (int i = a + 1; i < b; i++) {
            boolean isComposite = false;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
            }
            if (isComposite) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}