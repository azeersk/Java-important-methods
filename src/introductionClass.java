import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class introductionClass {
    public static void main(String[] args){
        //How to Print an Integer entered by an user
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("printing a the integer entered by user: "+a);

        int first = 32;
        int second = 233;
        System.out.println(first+second);

        float fOne = first *second;
        System.out.println(fOne);

        //Java Program to Find ASCII Value of a character
        char c = 'b';
        int ctoi = (int) c;
        System.out.println("Char to int: "+ctoi);

        //Java Program to Convert Character to
        String aS = Character.toString(c);
        System.out.println("Character to String: "+aS);

        char[] crArray = {'a','b','c','d','e'};
        String charA =String.valueOf(crArray);
        System.out.println(charA);

        String na = "hello world";
        char[] chars = na.toCharArray();
        System.out.println(Arrays.toString((chars) ));
        char drimer = '5';

        System.out.println(("Char: ")+ drimer);
        String Str2 = String.valueOf(drimer);
        System.out.println("char to integer: "+ Integer.parseInt(Str2)*3);

        
    }
}
