package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            double vui= abc(i);
            System.out.println(vui);
        }
//        GetSet getSet = new GetSet();
//        System.out.println(getSet.getArea());
    }
//        String string = "co len ban oi";
//        System.out.println(string.length());
//        System.out.println(string.charAt(3));
//        System.out.println(string.charAt(7));
//        String st = "may lam duoc!";
//        System.out.println(st.length());
//        System.out.println(string.equals(st));

//        String st1= 123+ "";
//        String st2= String.valueOf(123);
//        String st3 = Double.toString(344.432432);
//        System.out.println(st3);
//        System.out.println(st2);
//
//        int[]arr = {32,32,3,14,2,5,5};
//        double arr0 =0;
//        double arr1= 0;
//        double a ,b;
//
//        for (double i: arr) {
//            arr0 += i;
//            arr1 = arr1 + i;
//        }
//        a = arr0/arr.length;
//        b=Math.sqrt(arr0/arr.length - a * a);
//        System.out.println(arr0);
//        System.out.println(arr1);
//        System.out.println(a);
//        System.out.println(b);
//
//
//     int[]arr= {3,4,5,54,14,23};
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]++;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(abc(4));
//        System.out.println(abc(-5));
//
//    }
//
//    public static boolean abc (int num){
//        if (num%2==0){
//            return true;
//        }else {
//            return false;
//        }

    public static double abc (double i){
        return i*i;
    }
}