import java.io.*;
import java.util.Scanner;
class Ex3_h5{
    public static void main (String[] args) {
        String str= "Marym", nstr="";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Marym");
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

