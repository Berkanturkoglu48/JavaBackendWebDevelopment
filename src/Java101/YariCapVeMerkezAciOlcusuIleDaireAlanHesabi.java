package Java101;
import java.util.Scanner;
public class YariCapVeMerkezAciOlcusuIleDaireAlanHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yariCap,merkezAci;
        double pi=3.14,alan;

        System.out.print("Yarı çapı giriniz : ");
        yariCap=input.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz : ");
        merkezAci=input.nextInt();

        alan =(pi*(yariCap*yariCap)*merkezAci)/360;
        System.out.println("Dairenizin Alanı : " +alan);

    }
}
