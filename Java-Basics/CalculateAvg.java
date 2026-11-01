public class CalculateAvg{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int sum = 0;

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}
