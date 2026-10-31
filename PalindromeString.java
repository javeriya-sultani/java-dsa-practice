public class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);    //create reverse string
        }
        if(str.equals(rev)){    
            System.out.println("PALINDROME");
        }else{
            System.out.println("NON-PALINDROME");
        }
    }
}

            
