import java.util.Stack;

public class BalancedParentheses {

    // Function to check if the input string has balanced parentheses
    public static boolean isBalanced(String str) {
        // Counter to keep track of parentheses balance
        int balance = 0;

        // Traverse the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Increment or decrement the balance based on the type of parentheses encountered
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
            }
            // If the balance becomes negative, it means there are more closing parentheses than opening ones
            if (balance < 0) {
                return false;
            }
        }
        // If the balance is non-zero at the end, it means there are more opening parentheses than closing ones
        return balance == 0;
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
