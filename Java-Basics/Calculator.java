public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {

            System.out.print("Enter an operator (+, -, *, /, %, X to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                System.out.println("Calculator exited.");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {

                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero error!");
                        continue;
                    }

                } else if (op == '%') {

                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Modulo by zero error!");
                        continue;
                    }
                }

                System.out.println("Your answer: " + ans);

            } else {
                System.out.println("Invalid operation!");
            }
        }

        sc.close();
    }
}
