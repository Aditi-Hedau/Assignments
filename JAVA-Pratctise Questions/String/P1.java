public class P1 {
    public static void main(String[] args) {
        String input = "example string"; // Replace with your input string
        System.out.println("Maximum occurring character: " + getMax(input));
    }

    public static char getMax(String str) {
        int[] count = new int[256]; // ASCII character set
        int maxCount = -1;
        char result = ' ';

        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Find the character with the maximum count
        for (int i = 0; i < str.length(); i++) {
            if (maxCount < count[str.charAt(i)]) {
                maxCount = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
}
