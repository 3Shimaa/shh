import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        double square, cube, fourth, input;
        System.out.println("Enrer the number : ");
        input = x.nextDouble();
        square = Math.pow(input, 2);
        cube = Math.pow(input, 3);
        fourth = Math.pow(input, 4);
        int z = (int) square;
        int y = (int) cube;
        int i = (int) fourth;
        int m = (int) input;

        System.out.println("The square, cube, and the fourth power of "+ m + " are: " + z+ " , "+ y+ " , "+ i + " respectively.");
    }
}