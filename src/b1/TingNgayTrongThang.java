package b1;

import java.util.Scanner;

public class TingNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap thang can tim");
        int thang = scanner.nextInt();
        switch (thang){
            case 2:
                System.out.println("thang 2 có 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+ thang + " có 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+ thang+ " co 30 ngay");
        }
    }
}
