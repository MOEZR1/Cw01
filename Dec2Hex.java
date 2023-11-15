public class Dec2Hex {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No input argument provided.");
            return;
        }

        int decimalNumber;
        try {
            decimalNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The provided input is not a valid integer.");
            return;
        }

        System.out.println("Converting the Decimal Value " + decimalNumber + " to Hex...");
        String hexResult = convertToHex(decimalNumber);
        System.out.println("Hexadecimal representation is: " + hexResult);
    }

    public static String convertToHex(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
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
}
