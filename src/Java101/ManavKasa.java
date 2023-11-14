package Java101;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,toplam;
        double kgArmut , kgElma, kgDomates, kgMuz, kgPatlican;

        System.out.println("Kaç kilo patlıcan aldınız ?");
        kgPatlican = input.nextDouble();

        System.out.println("Kaç kilo muz aldınız ?");
        kgMuz = input.nextDouble();

        System.out.println("Kaç kilo domates aldınız ?");
        kgDomates = input.nextDouble();

        System.out.println("Kaç kilo elma aldınız ?");
        kgElma = input.nextDouble();

        System.out.println("Kaç kilo armut aldınız ?");
        kgArmut = input.nextDouble();

        toplam =(armut*kgArmut)+(elma*kgElma)+(domates*kgDomates)+(muz*kgMuz)+(patlican*kgPatlican);
        System.out.println("Toplam Tutar :"+toplam);


    }
}
