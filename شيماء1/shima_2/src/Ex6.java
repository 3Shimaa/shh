import java.util.Scanner;
public class Ex6 {
    private static Scanner sc;
    public static void main(String[] args) {
        String PrintFirstLastChar;
        sc= new Scanner(System.in);
        System.out.print("\nEnter String to Print 1st & last Character =  ");
        PrintFirstLastChar = sc.nextLine();
        StringBuilder sb = new StringBuilder(PrintFirstLastChar);
        char firstCh = sb.charAt(0);
        System.out.println("\nThe First Character in " + PrintFirstLastChar + " = " +  firstCh);
        char lastCh = sb.charAt(PrintFirstLastChar.length() - 1);
        System.out.println("The Last Character in " + PrintFirstLastChar + "  = " +  lastCh);
    }
}