public class P3 {
        public static void main(String[] args) {
            String input = "example string"; // Replace with your input string
            printDuplicates(input);
        }
    
        public static void printDuplicates(String str) {
            int[] count = new int[256]; // ASCII character set
    
            // Count the occurrences of each character
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i)]++;
            }
    
            // Print characters that appear more than once
            System.out.println("Duplicate characters:");
            for (int i = 0; i < 256; i++) {
                if (count[i] > 1) {
                    System.out.println((char) i + ": " + count[i] + " times");
                }
            }
        }
    }
    
