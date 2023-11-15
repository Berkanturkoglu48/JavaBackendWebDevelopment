package Java101;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void sum(int n1,int n2){
        int result = n1+n2;
        System.out.println("Sonucunuz : "+ result);

    }

    static void minus(int n1,int n2){
        int result = n1-n2;
        System.out.println("Sonucunuz : "+ result);

    }

    static void times(int n1,int n2){
        int result = n1*n2;
        System.out.println("Sonucunuz : "+ result);

    }

    static void divide(int n1,int n2){
        if (n2 == 0){
            System.out.println("İkinci sayınız 0 olamaz");
        }
        else {
            int result = n1 / n2;
            System.out.println("Sonucunuz : " + result);
        }
    }
    static void exponent(int n1,int n2){
        int result=1;
        for(int i =1 ; i <= n2 ;i++){
            result*=n1;
        }
        System.out.println("Sonucunuz : " + result);
    }

    static void mod(int n1,int n2){
        int result = n1 % n2;
        System.out.println("Sonucunuz : " + result);

    }
    static void perimeterAndArea(int n1 , int n2){
        int perimeter = n1 + n2;
        int area = n1 * n2 ;
        System.out.println("Çevre : " + perimeter + " Alan : "+ area);
    }

    static void fact(int n1,int n2){
        int result = 1;
        int result2 = 1;
        for(int i =1;i<=n1;i++){
            result*=i;
        }
        for(int j =1;j<=n2;j++){
            result2*=j;
        }
        System.out.println("İlk sayınızın faktöriyeli : " + result + " İkinci sayınızın Faktöriyeli : " + result2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = """
                Hoşgeldiniz :)
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap
                Hangi işlemi yapmak istiyorsunuz ?""";


        while(true) {
            System.out.println(menu);
            select=input.nextInt();

            if (select == 0){
                break;
            }
            System.out.println("İlk sayınız ?");
            int n1=input.nextInt();

            System.out.println("İkinci sayınız ?");
            int n2=input.nextInt();

            switch (select) {
                case 1 -> sum(n1, n2);
                case 2 -> minus(n1, n2);
                case 3 -> times(n1, n2);
                case 4 -> divide(n1, n2);
                case 5 -> exponent(n1, n2);
                case 6 -> fact(n1, n2);
                case 7 -> mod(n1, n2);
                case 8 -> perimeterAndArea(n1, n2);
                default -> System.out.println("Hatalı işlem seçimi !");
            }


        }
        System.out.println("Güle Güle");
    }
}
