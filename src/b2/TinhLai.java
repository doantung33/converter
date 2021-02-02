package b2;

import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double tienchovay;
        double tilelai ;
        int thangchovay;

        System.out.println("nhap tien cho vay");
        tienchovay= scanner.nextDouble();
        System.out.println("nhap ti le lai");
        tilelai= scanner.nextDouble();
        System.out.println("nhap thang cho vay");
        thangchovay= scanner.nextInt();


        double tongtienlai=0;
        for (int i = 0; i < thangchovay; i++) {
            tongtienlai+= tienchovay *(tilelai*100 /12)* thangchovay;
        }

        System.out.println("tien lai la "+ tongtienlai);
    }
}
