package Java101;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int fizik,kimya,turkce,matematik,tarih,muzik;
        double ortalama;

        System.out.println("Tarih dersi notunuzu giriniz");
        tarih = input.nextInt();

        System.out.println("Matematik dersi notunuzu giriniz");
        matematik = input.nextInt();

        System.out.println("Fizik dersi notunuzu giriniz");
        fizik = input.nextInt();

        System.out.println("Kimya dersi notunuzu giriniz");
        kimya = input.nextInt();

        System.out.println("Müzik  dersi notunuzu giriniz");
        muzik = input.nextInt();

        System.out.println("Türkçe dersi notunuzu giriniz");
        turkce = input.nextInt();

        ortalama = (tarih + turkce + muzik + matematik + kimya + fizik) / 6.0 ;

        String kalmaDurumu = (ortalama < 50) ? "Kaldınız" : "Geçtiniz";

        System.out.println("Ortalamanız " + ortalama + " " + kalmaDurumu);




    }
}
