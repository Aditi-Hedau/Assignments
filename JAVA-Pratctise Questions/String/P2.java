
class P2 {
  public static String removeDuplicateLetters(String s) {
 
    String ans = "";
    for (int i = 0; i < s.length(); i++) {
      int j = 0;
      for (j = 0; j < i; j++) {
        if (s.charAt(i) == s.charAt(j)) //same character found
        {
          break;
        }
      }
      if (i == j) {
        ans += s.charAt(i);
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    String str = "Java";
    System.out.println("Original String: "+str);
    System.out.println("After removing duplicates: "+removeDuplicateLetters(str));
 
  }
}


