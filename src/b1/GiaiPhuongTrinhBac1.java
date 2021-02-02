package b1;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class
GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        System.out.println("pt có dạng ax+b=c");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextDouble();
        System.out.println("enter b");
        double b = sc.nextDouble();
        System.out.println("enter c");
        double c = sc.nextDouble();

        if (a==0){
            System.out.println("pt vo nghiem");
        }else {
            if (a!=0){
                double nghiem1 = (c-b)/a;
                System.out.println(" nghiệm = "+ nghiem1);
            }else {
                if (b==0){
                    double nghiem = c/a;
                    System.out.println("nghiem = "+ nghiem);
                }

            }
        }
    }
}
