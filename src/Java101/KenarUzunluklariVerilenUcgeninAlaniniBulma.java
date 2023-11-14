package Java101;
import java.util.Scanner;

public class KenarUzunluklariVerilenUcgeninAlaniniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double birinciKenar,ikinciKenar,ucuncuKenar,alan,u;

        System.out.println("Birinci kenarı giriniz :");
        birinciKenar= input.nextDouble();

        System.out.println("İkinci kenarı giriniz :");
        ikinciKenar= input.nextDouble();

        System.out.println("Üçüncü kenarı giriniz :");
        ucuncuKenar= input.nextDouble();

        u = (birinciKenar+ikinciKenar+ucuncuKenar)/2;
        alan =Math.sqrt(u * (u-birinciKenar)* (u-ikinciKenar) * (u-ucuncuKenar));

        System.out.println("Üçgeninizin alanı :" + alan);

    }
}
