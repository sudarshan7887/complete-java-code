public class Palindrome {
    public static void main(String[] args) {
        
        String str = "nitin";

        String reverse = "";

        for(int i = 0;i>=str.length()-1;i--)
        {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palinrome");
        }
    }
    
}
