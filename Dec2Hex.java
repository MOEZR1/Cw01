public class Dec2Hex {

    /**
     * Converts a decimal number to its hexadecimal representation.
     * @param decimalNumber The integer to convert to a hexadecimal string.
     * @return A string representing the hexadecimal value of the input integer.
     */
    public static String convertToHex(int decimalNumber) {
        // Hexadecimal characters
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        // StringBuilder is used for efficient string concatenation
        StringBuilder hexadecimal = new StringBuilder();
        // Loop to process the number until division result is 0
        while (decimalNumber > 0) {
            int rem = decimalNumber % 16; // Remainder of division by 16
            hexadecimal.insert(0, ch[rem]); // Prepend the hex character
            decimalNumber /= 16; // Divide by 16 for next iteration
        }
        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            throw new IllegalArgumentException("Error: No input argument provided.");
        }
 
        int Arg1;
        // Try to parse the argument as an integer
        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: The provided input '" + args[0] + "' is not a valid integer.");
        }
 
        // Output the conversion process
        System.out.println("Converting the Decimal Value " + Arg1 + " to Hex...");
        String hexResult = convertToHex(Arg1);
        System.out.println("Hexadecimal representation is: " + hexResult);
    }
 
}
