import java.util.Random;
public class Ex4_h5
{
    public static void main(String[] args)
    {
        int rollValue = die();
        System.out.println(rollValue);
    }
    public static int die()
    {
        Random generator = new Random();
        return generator.nextInt(6)+1;
    }
}