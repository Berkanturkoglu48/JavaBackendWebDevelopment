package Java101;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ilkSayi,islem;
        double sonuc,ikinciSayi;

        System.out.println("İlk sayıyı giriniz");
        ilkSayi=input.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        ikinciSayi = input.nextDouble();

        System.out.println("Hangi işlemi yapmak istiyorsunuz : \n1.TOPLAMA\n2.ÇIKARMA\n3.BÖLME\n4.ÇARPMA");
        islem=input.nextInt();

        switch (islem) {
            case 1 -> {
                sonuc = ilkSayi + ikinciSayi;
                System.out.println("Sonuç : " + sonuc);
            }
            case 2 -> {
                sonuc = ilkSayi - ikinciSayi;
                System.out.println("Sonuç : " + sonuc);
            }
            case 3 -> {
                if (ikinciSayi == 0) {
                    System.out.println("Bölen sayı sıfır olamaz!");
                } else {
                    sonuc = ilkSayi / ikinciSayi;
                    System.out.println("Sonuç : " + sonuc);
                }
            }
            case 4 -> {
                sonuc = ilkSayi * ikinciSayi;
                System.out.println("Sonuç : " + sonuc);
            }
            default -> System.out.println("Hatalı giriş yaptınız");
        }

    }
}
