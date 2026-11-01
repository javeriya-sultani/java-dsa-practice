public class CheckLeapYear{
Scanner sc = new Scanner(System.in);  
  int y = sc.nextInt();
    if(y % 400 == 0){
    System.out.println("LEAP YEAR ");
   }else if(y % 100 == 0){
    System.out.println("NOT leap year ");
   }else if(y % 4 == 0){
     System.out.println("LEAP YEAR");
   }
   else{
     System.out.println("NOT leap year");
