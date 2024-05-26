public class P5 {
        public static void main(String[] args) {
            String str1 = "XYZ";
            String str2 = "ZXY";
    
            if (areRotations(str1, str2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }
    
        public static boolean areRotations(String str1, String str2) {
            // Check if lengths are equal and strings are non-empty
            if (str1.length() != str2.length() || str1.length() == 0) {
                return false;
            }
    
            // Concatenate str1 with itself
            String concatenated = str1 + str1;
    
            // Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }
    }
    
