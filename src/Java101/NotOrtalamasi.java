package Java101;
import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args ) {
        Scanner input= new Scanner(System.in);

        System.out.println("Matematik Dersi Notunuzu Giriniz : ");
        int matematik = input.nextInt();

        System.out.println("Fizik Dersi Notunuzu Giriniz : ");
        int fizik = input.nextInt();

        System.out.println("Kimya Dersi Notunuzu Giriniz : ");
        int kimya = input.nextInt();

        System.out.println("TÜrkçe Dersi Notunuzu Giriniz : ");
        int turkce = input.nextInt();

        System.out.println("Tarih Dersi Notunuzu Giriniz : ");
        int tarih = input.nextInt();

        System.out.println("Müzik Dersi Notunuzu Giriniz : ");
        int muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya +turkce + tarih + muzik)/6.0 ;

        System.out.println("Genel Not Ortalamanız : " + ortalama) ;

        System.out.println(ortalama < 60 ? "Sınıfta Kaldınız " : "Tebrikler Sınıfı Geçtiniz");



    }
}