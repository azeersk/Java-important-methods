import java.util.Arrays;

public class mathClass {
    public static void main(String[] args){
        int[] arrayNum = {10,20,30,40,50};
        System.out.println(Arrays.toString(arrayNum));

        //math.abs() method
        int abOne = 999999999;
        float abFlo = (float)-32.3232;
        double abDou = -1232.32432;
        System.out.println("Int abs: "+ Math.abs(abOne));
        System.out.println("Float abs: "+Math.abs(abFlo));
        System.out.println("Double abs: "+ Math.abs(abDou));

        //acos method
        float acFlo = 0.0f;
        double acDou = 0.325;
        System.out.println(Math.acos(acDou));
        System.out.println(Math.acos(acFlo));

        //addExact subtractExact multiplyExact
        int a = 4;
        double d = 9.43;
        System.out.println("addExact values: "+Math.addExact(a, (int) d));
        System.out.println("SubtractExact values: "+ Math.subtractExact(a,(int)d));
        System.out.println("MultiplicationExact values: "+Math.multiplyExact(a,(int)d));

        //math.sqrt method
        System.out.println("Square root of value: "+Math.sqrt(625));

        //math.cbrt method
        System.out.println("Cube root of the value: "+Math.cbrt(27));

        //math.pow method
        double powOf = Math.pow(4,4);
        System.out.println("value power of: "+ powOf);

        //min and max method
        System.out.println("min value: "+ Arrays.stream(arrayNum).min());
        System.out.println("min value: "+ Arrays.stream(arrayNum).max());

        //ceil method
        System.out.println("Ceil of the value: "+Math.ceil(12.21));

        //floor method
        double flo = 75.7545;
        System.out.println("Floor value is: "+Math.floor(flo));

       //redians methode
        double radi = Math.toRadians(3223.34);
        System.out.println("radians of: "+radi);

    }
}
