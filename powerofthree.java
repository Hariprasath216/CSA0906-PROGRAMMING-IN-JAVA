class power {
    public static void main(String args[]) {
        int n = 27;
        boolean isPowerOfThree = isPowerOfThree(n);
        System.out.println(isPowerOfThree);
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; 
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false; 
            }
            n /= 3;
        }

        return n == 1; 
    }
}