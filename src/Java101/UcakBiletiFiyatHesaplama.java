package Java101;
import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        int km,age, tip;
        double fee = 0.10 , total, discount;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz : ");
        km= input.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.println("Tek yön ise : 1 , Çift yön ise : 2 yi tercih ediniz :");
        tip = input.nextInt();

        if ((km<0) || (age<0) || ((tip != 1) && (tip != 2))){
            System.out.println("Hatalı veri girdiniz!");
        }else {
            total= km * fee;

            if (age < 12) {
                discount = total * 0.50;
                total = total - discount;
            }else if ((age<=24)){
                discount = total * 0.10;
                total =total - discount;
            }else if(age >= 65) {
                discount = total * 0.30;
                total = total - discount;
            }
            if (tip == 2) {
                discount = total * 0.20;
                total = (total - discount)*2;
            }
            System.out.println("Toplam ödeyeceğiniz tutar : " + total);


        }


    }
}