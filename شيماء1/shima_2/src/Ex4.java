import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {
        float len, bre, area;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Length of Rectangle: ");
        len = s.nextFloat();
        System.out.print("Enter the Breadth of Rectangle: ");
        bre = s.nextFloat();

        area = len * bre;
        System.out.println("\nArea = " + area);
    }
}
