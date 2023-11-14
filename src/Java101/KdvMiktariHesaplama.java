package Java101;
import java.util.Scanner;
public class KdvMiktariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kdv;
        double tutar,kdvTutari,kdvliTutar;

        System.out.println("Tutar giriniz");
        tutar = input.nextInt();
        kdv = (tutar <= 1000)? 18:8;

        kdvTutari = (tutar / 100)*kdv;
        kdvliTutar = tutar+kdvTutari;

        System.out.println("Kdv siz fiyat : "+ tutar);
        System.out.println("Kdv tutarı : "+ kdvTutari);
        System.out.println("Toplam Tutar : "+ kdvliTutar);


    }
}
