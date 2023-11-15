public class Dec2Hex {
//MOhammed
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input provided");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            String hexadecimal = convertToHex(num);
            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + args[0]);
        }
    }

    public static String convertToHex(Integer num) {
        if (num == null) {
            throw new IllegalArgumentException("No input provided");
        }

        if (num < 0) {
            return "Invalid Input";
        }

        if (num == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();
        while (num != 0) {
            int rem = num % 16;
            hexadecimal.insert(0, HEX_CHARS[rem]);
            num = num / 16;
        }

        return hexadecimal.toString();
    }
}
