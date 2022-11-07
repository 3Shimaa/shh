import java.util.Scanner;
public class Ex3h3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter the third number: ");
        num3 = input.nextDouble();
        input.close();
        System.out.println((num1 > num2 == true) && (num2 > num3 == true)? "Decreasing":
                (num1 < num2 == true) && (num2 < num3 == true)? "Increasing":
                        "Neither");
    }
}