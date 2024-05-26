public class P6 {
        public static void main(String[] args) {
            String input = "abcde";
            System.out.println("Reversed string: " + reverseUsingStringBuilder(input));
        }
    
        public static String reverseUsingStringBuilder(String str) {
            return new StringBuilder(str).reverse().toString();
        }
    }
    
