package Java101;
import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int birthyear;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz :");
        birthyear = input.nextInt();
        birthyear %= 12;

        switch (birthyear) {
            case 0 -> System.out.println("Çin zodyağı değeriniz : MAYMUN ");

            case 1 -> System.out.println("Çin zodyağı değeriniz : HOROZ ");

            case 2 -> System.out.println("Çin zodyağı değeriniz : KÖPEK ");

            case 3 -> System.out.println("Çin zodyağı burcunuz : DOMUZ ");

            case 4 -> System.out.println("Çin zodyağı burcunuz : FARE ");

            case 5 -> System.out.println("Çin zodyağı burcunuz : ÖKÜZ ");

            case 6 -> System.out.println("Çin zodyağı burcunuz : KAPLAN ");

            case 7 -> System.out.println("Çin zodyağı burcunuz : TAVŞAN ");

            case 8 -> System.out.println("Çin zodyağı burcunuz : EJDERHA ");

            case 9 -> System.out.println("Çin zodyağı burcunuz : YILAN ");

            case 10 -> System.out.println("Çin zodyağı burcunuz : AT ");

            case 11 -> System.out.println("Çin zodyağı burcunuz : KOYUN ");

            default -> {
            }
        }

    }
}
