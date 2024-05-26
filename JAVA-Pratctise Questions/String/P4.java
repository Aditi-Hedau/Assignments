public class P4 {
        public static void main(String[] args) {
            String str1 = "india is great"; // First string
            String str2 = "in";         // Second string
            System.out.println("Result after removing characters: " + removeChars(str1, str2));
        }
    
        public static String removeChars(String str1, String str2) {
            boolean[] toRemove = new boolean[256]; // ASCII character set
    
            // Mark characters present in the second string
            for (int i = 0; i < str2.length(); i++) {
                toRemove[str2.charAt(i)] = true;
            }
    
            // Construct the result string
            String result = "";
            for (int i = 0; i < str1.length(); i++) {
                if (!toRemove[str1.charAt(i)]) {
                    result += str1.charAt(i);
                }
            }
    
            return result;
        }
    }
    

