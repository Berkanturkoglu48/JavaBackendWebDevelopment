package Java101;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,startFee=10;
        double tutar,perKm=2.20;

        System.out.println("Seyehatiniz kaç KM sürdü ?");
        mesafe = input.nextInt();

        tutar = startFee+ (mesafe*perKm);

        tutar = (tutar <20) ? 20:tutar;
        System.out.println("Ödemeniz gerekn tutar : " +tutar);


    }
}