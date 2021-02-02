package b1;

import java.util.Scanner;

public class SdToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double hieght;
        System.out.println("enter width");
        width= scanner.nextDouble();
        System.out.println("enter height");
        hieght= scanner.nextDouble();

        double S = width*hieght;
        System.out.println("S = "+ S);
    }


}
