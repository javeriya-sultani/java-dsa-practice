public class CountNum{
    public static void main(String[] args) {
        int count = 0;
        int n = 234272;
        while (n > 0) {
            int rem = n % 10;  // return last digit 
            if(rem == 2){
                count++;
            }
            n = n / 10;    // return number by removing last digit 
            
        }
        System.out.println(count);
    }
}
