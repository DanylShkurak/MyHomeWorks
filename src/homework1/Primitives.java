package homework1;

import java.util.Arrays;

public class Primitives {
    public static void main(String[] args) {
        //Task2
        boolean isTrue = true;
        char s = 's';
        short weight = 3500;
        float precision = 54.3F;
        long stars = 1212134123;
        byte fingers = 10;
        String hi = new String("hi");
        String hello = "hello";
        int int1 = 3;
        int int2 = 2;
        int int3 = 1;
        String strInt = "" + int1 + int2 + int3;
        double d1 = 2.2;
        double d2 = 3.3;
        double d3 = 2.4;
        String strDouble = " " + d1 + d2 + d3;
        // Task 3
        int ex1 = weight - fingers * weight;
        int ex2 = int2 + weight / int3;
        int ex3 = weight * int2 + int3;
        int ex4 = fingers + fingers + fingers;
        int ex5 = int1 - int2 - int3;
        double ex6 = precision + int1 - stars;
        double ex7 = d1 * precision + int3;
        double ex8 = d3 - d2 + d1;
        double ex9 = weight * d3 / d2;
        double ex10 = precision * d3 + d2;
        System.out.println(ex1 + "," + ex2 + "," + ex3 + "," + ex4 + "," + ex5 + "," + ex6 + "," + ex7 + "," + ex8 + "," + ex9 + "," + ex10);
        //Task4
        ex1 += fingers;
        ex2 -= ex1;
        ex3 /= 1;
        ex4 *= 2;
        ex5 -= ex4;
        ex6 *= weight;
        ex7 /= d1;
        ex8 += ++ex8;
        ex9 /= 10;
        ex10 += stars;
        System.out.println(ex1 + "," + ex2 + "," + ex3 + "," + ex4 + "," + ex5 + "," + ex6 + "," + ex7 + "," + ex8 + "," + ex9 + "," + ex10);

        //Task5
        System.out.println(!isTrue);
        System.out.println(!false);
        System.out.println(2<4 && 2 >5);
        System.out.println(!(45==7));
        System.out.println((2==2 || 2==4));

        //Task 6
        int one = 1;
        for (int i = 0; i <8 ; i++) {
            if (i==1) --one;
            if (i==2) one++;

            if(i==6) one++;
            if(i==7) --one;
            System.out.println(one);
        }
        //Task 7
        int[] array = new int [10];
        for (int i = 0; i <array.length ; i++) {
            int randomizer = (int)(Math.random()*100);
            array[i]=randomizer;
        }
        System.out.println(Arrays.toString(array));
    }
}
