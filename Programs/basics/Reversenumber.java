public class Reversenumber {
    public static void main(String[] args) {
        
        int n = 123456;
        int reverse = 0;

            while(n!=0)
            {
                    reverse = reverse * 10;
                    reverse = reverse + n % 10;
                    n = n/10;
            }
        System.out.println(reverse);
    }
    
}
