package Java101 ;
import java.util.Scanner;
public class RecursiveMetodIleAsalSayiBulma {

    static boolean isAsal(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return isAsal(sayi, bolen - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi ;

        System.out.println("Sayınızı giriniz : ");
        sayi=input.nextInt();

        if (isAsal(sayi, sayi / 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }

}