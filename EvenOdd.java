import java.util.Scanner;

@FunctionalInterface
interface CheckNumber {
    String check(int number);
}

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CheckNumber isEven = (n) -> (n % 2 == 0) ? "Even" : "Odd";

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The number is " + isEven.check(num));

        sc.close();
    }
}
