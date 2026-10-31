public class PrimeNumber{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i <= n-1; i++){    // prime: n divisible by 1 and itself; hence i=2
              if(n % i == 0){
                isPrime = false;
              }
            }
        }
        
        if(isPrime){
            System.out.println("PRIME");
        }else{
            System.out.println("NON-PRIME");
        }
    }
}
        
      
