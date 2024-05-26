public class P9 {
    public static void main(String[] args) {
        String input = "JAVA";
        char firstNonRepeating = findFirstNonRepeating(input);
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeating(String str) {
        int[] count = new int[256]; // Assuming ASCII characters
        char[] chars = str.toCharArray();

        // Count the occurrences of each character
        for (char ch : chars) {
            count[ch]++;
        }

        // Find the first non-repeating character
        for (char ch : chars) {
            if (count[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }
}

