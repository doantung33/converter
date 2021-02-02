package b1;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam");
        int nam = sc.nextInt();
        if (nam%4==0){
            if (nam%100==0){
                if (nam%400==0) {
                    System.out.println("Nam " + nam + " la nam nhuan");
                }else {
                    System.out.println("Nam "+ nam + " khong phai nam nhuan");
                }
            }else {
                System.out.println("Nam " + nam + " la nam nhuan");
            }
        }else {
            System.out.println("Nam "+ nam + " khong phai nam nhuan");
        }
    }
}
