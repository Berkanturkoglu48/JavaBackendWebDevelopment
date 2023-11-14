package Java101;
import java.util.Scanner;
public class VucutKitleIndexiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy,kilo,vkIndexi;

        System.out.print("Boyunuzu giriniz(Metre cinsinden) :");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz :");
        kilo = input.nextDouble();

        vkIndexi = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndexiniz  : "+vkIndexi);

    }
}
