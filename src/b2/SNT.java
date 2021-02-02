package b2;
import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so can check");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+ " khong phai so nguyen to");
        }else {
            boolean check = true;
            for (int i=2; i< Math.sqrt(number);i++){
                if (number%i==0){
                    check= false;
                    break;
                }
            }
            if (check){
                System.out.println(number + " la so nguyen to");
            }else {
                System.out.println(number + " khong la so nguyen to");
            }
        }
    }

}
