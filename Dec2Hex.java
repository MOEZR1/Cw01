public class Dec2Hex {

    /**
     * Converts a decimal number to its hexadecimal representation.
     * @param decimalNumber The decimal number to convert.
     * @return The hexadecimal representation of the given decimal number.
     */
    public static String convertToHex(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0"; // Handle the edge case for 0
        }

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder hexadecimal = new StringBuilder();

        while (decimalNumber > 0) {
            int rem = decimalNumber % 16;
            hexadecimal.insert(0, hexChars[rem]);
            decimalNumber /= 16;
        }

        return hexadecimal.toString();
    }

    /**
     * The main method that takes an input argument, converts it to a decimal number,
     * and prints its hexadecimal representation.
     * @param args Command line arguments, expecting a single integer.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Error: No input argument provided.");
        }

        int decimalNumber;
        try {
            decimalNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: The provided input is not a valid integer.");
        }

        System.out.println("Converting the Decimal Value " + decimalNumber + " to Hex...");
        String hexResult = convertToHex(decimalNumber);
        System.out.println("Hexadecimal representation is: " + hexResult);
    }
}

