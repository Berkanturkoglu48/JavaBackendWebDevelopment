package Java101;
import java.util.Scanner;

public class DeseneGoreMetodOlusturma {

    static void recursiveDesign(int sayi) {
        if (sayi <= 0) {
            System.out.print(sayi+" ");

        } else {
            System.out.print(sayi+" ");
            recursiveDesign(sayi - 5);
            System.out.print(sayi+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();


        recursiveDesign(sayi);
    }


}