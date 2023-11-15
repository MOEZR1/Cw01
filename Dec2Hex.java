public class Dec2Hex {
    static int Arg1;

    public static void main(String args[]) {
        // Parse the first argument as an integer
        Arg1 = Integer.parseInt(args[0]);

        // Character array representing hexadecimal digits
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        int rem, num;
        num = Arg1; // Assign input number to 'num'
        String hexadecimal = ""; // Initialize hexadecimal string

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        // Conversion process using modulo and division
        while (num != 0) {
            rem = num % 16; // Get remainder
            hexadecimal = ch[rem] + hexadecimal; // Convert to hex digit and append
            num = num / 16; // Reduce number
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
