public class P10{

    static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)    
            return true;  
       
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;   

        if (s < e + 1) 
            return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }   
    static boolean isPalindrome(String str) 
    { 
        int n = str.length();   

        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
    }   
  

    public static void main(String args[]) 
    { 
        
        String str = "mam";
 
        if (isPalindrome(str)) 
            System.out.println(str+" is palindrome"); 
        else
            System.out.println(str+ " is not a palindrome"); 
    }   
}
	
