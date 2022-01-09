import java.util.Arrays;
import java.util.Locale;

public class stringClass{
    public static void main(String[] args){
        //Split method
        String name = "String Methods are: ";
        String[] array = name.split(" ");
        System.out.println(Arrays.toString(array));

        //CompareTo method
        String nameOne = "Something";
        String nameTwo = "Anything";
        String nameThree = "ANYThing";
        System.out.println("CompareTo: "+nameTwo.compareTo(nameOne));
        System.out.println(nameTwo.compareTo(nameThree));

        //compareToIgnoreCase method
        String animal = "Tiger";
        String bird = "Shift";
        String birdOne = "SHIFt";
        System.out.println(animal.compareToIgnoreCase(bird));
        System.out.println(bird.compareToIgnoreCase(birdOne));

        //length method
        String l = "length of the string";
        System.out.println("Length: "+l.length());

        //replace method
        String r = "ball thrown by balu";
        String rr = "zeeTv";
        System.out.println("Replace: "+r.replace('b','a'));
        System.out.println("Replace subString: "+rr.replace("zee","maa"));

        //replaceAll method
        String replaceA = "Hello World! Hello";
        System.out.println(replaceA.replaceAll("Hello","Good"));

        //subString method
        String subOf = "welcome to virtual world";
        System.out.print(subOf.substring(0,10));
        System.out.println(" my world!");

        //equals method
        String eOne = "azeEr";
        String eTwo = "azEer";
        System.out.println("equals: "+eOne.equals(eTwo));

        //equalsIgnoreCase method
        String eic1 = "AppLe";
        String eic2 = "APPLe";
        System.out.println("Equal ignore case: "+eic1.equalsIgnoreCase(eic2));

        //contains method
        String con = "this language is java.";
        System.out.println("contains: "+con.contains("java."));

        //indexOf method
        String inDex = "Fishing";
        System.out.println("Index of: "+ inDex.indexOf('n'));

        //trim method
        String t = "      GOD bless you!!!    ";
        System.out.println("trim of: "+ t.trim());

        //lower case method
        String lCase = "LoWeR CAsE";
        System.out.println("lower case: "+ lCase.toLowerCase());

        //upper case method
        String uCase = "Upper CaSe";
        System.out.println("Upper case: "+ uCase.toUpperCase());

        //concat method
        String Str1 = "My name is";
        String Str2 = " Azeer";
        System.out.println(Str1.concat(Str2));

        //valueOf method
        String vO = "12123.434La";
        System.out.println("value Of: "+String.valueOf(vO));
        System.out.println(Integer.valueOf('A'));

        //matches method
        String mat = "Java";
        String matOf = "J..a";
        System.out.println("Matches: "+ mat.matches(matOf));

        //startsWith method
        String mailS = "azeersk970@gmail.com";
        System.out.println("starts with: "+ mailS.startsWith("azeer"));

        //endsWith method
        String mailE = "valorDohiries@gmail.com";
        System.out.println("Ends with: "+ mailE.endsWith("@gmail.com"));

        //isEmpty method
        String empty = "";
        String emptyOne = "some";
        System.out.println("is empty: "+ emptyOne.isEmpty());
        System.out.println(empty.isEmpty());

        //intern method
        String jOne =new String("java");
        String jTwo =new  String("java");
        System.out.println(jOne==jTwo);
        jOne = jOne.intern();
        jTwo = jTwo.intern();
        System.out.println("after intern: "+ (jOne==jTwo));




    }
}
