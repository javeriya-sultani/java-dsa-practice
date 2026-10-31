public class PalindromeNumber{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("enter a number: ");
            int n = sc.nextInt();
            int original = n;  
            int rev = 0;
            while (n > 0) {
               int rem = n % 10;  //returns last digit
                n = n / 10;       //removes the last digit of number
                rev = rev * 10 + rem; //reverse the number
            } 
            
            if(original == rev){
              System.out.println("PALINDROME");
        }else{
            System.out.println("NON-PALINDROME");  
            }

        }
    }
        
