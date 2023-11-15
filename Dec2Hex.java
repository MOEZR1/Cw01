public class Dec2Hex {
 
    public static String convertToHex(int decimalNumber) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder hexadecimal = new StringBuilder();
        while (decimalNumber > 0) {
            int rem = decimalNumber % 16;
            hexadecimal.insert(0, ch[rem]);
            decimalNumber /= 16;
        }
        return hexadecimal.toString();
    }
 
public static void main(String[] args) {
    if (args.length == 0) {
        throw new IllegalArgumentException("Error: No input argument provided.");
    }
 
    int Arg1;
    try {
        Arg1 = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
        throw new NumberFormatException("Error: The provided input is not a valid integer.");
    }
 
    System.out.println("Converting the Decimal Value " + Arg1 + " to Hex...");
    String hexResult = convertToHex(Arg1);
    System.out.println("Hexadecimal representation is: " + hexResult);
}
 
}
