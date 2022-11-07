import java.util.Scanner;
    public class Ex1h3 {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = in.nextInt();
            if (num > 0)
            {
                System.out.println("Number is positive");
            }
            else if (num < 0)
            {
                System.out.println("Number is negative");
            }
            else
            {
                System.out.println("Number is zero");
            }
        }
    }

