import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        String kAdi, kSifre;

        System.out.print("Kullanıcı adınızı giriniz: ");
        kAdi = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        kSifre = input.nextLine();

        if (kAdi.equals("patika") && kSifre.equals("patika")) {
            System.out.println("Giriş Başarılı.");
        } else if (kAdi.equals("patika")) {
            System.out.println("Şifrenizi hatalı girdiniz.\nSıfırlamak istiyorsanız 1 çıkış yapmak istiyorsanız 2'yi tuşlayın.");
            secim = input.nextInt();

            if (secim == 1) {
                System.out.println("Yeni şifrenizi giriniz");
                kSifre = input.next();  // nextLine yerine next kullanabilirsiniz

                if (kSifre.equals("patika")) {
                    System.out.println("Eskiden kullandığınız bir şifreyi tekrar kullanamazsınız!");
                } else {
                    System.out.println("Şifre değiştirme işlemi başarılı");
                }
            } else {
                System.out.println("Çıkış yapılıyor...");
            }
        } else {
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}