public class AdvanceString {

    // Method to print Largest String
    public static void largestString(String[] fruits) {
        String largest = fruits[0];

        // Traverse the array
        for (int i = 1; i < fruits.length; i++) {
            // Condition
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);

    }

    // Method to use of StringBuilder
    public static void useBuilder(StringBuilder sb) {
        // Traverse the string
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());

    }

    // Mehtod to Convert 1st Letter in Paragraph Convert to UpperCase
    public static String printUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Traverse the string
        for (int i = 1; i < str.length(); i++) {
            // If Space found then next Number to upperCase
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression(StringBuilder sb) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            int count = 1;

            while (i < sb.length() - 1 && sb.charAt(i) == sb.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(sb.charAt(i));

            if (count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String fruits[] = { "mango", "banana", "apple" };
        largestString(fruits);

        // Call useBuilder
        StringBuilder sb = new StringBuilder("");
        useBuilder(sb);

        // Call printUpperCase
        String str = "hi i am vibhu dubey";
        System.out.println(printUpperCase(str));

        // Call stringCompression
        stringCompression(sb);

    }
}