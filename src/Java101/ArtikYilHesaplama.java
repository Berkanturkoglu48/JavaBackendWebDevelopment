package Java101;
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        boolean result = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl giriniz");
        year = input.nextInt();

        if (year%4 == 0) {
            result = (year % 100 != 0) || year % 400 == 0;
        }
        if (result){
            System.out.println(year + " yılı artık yıldır.");
        }else{
            System.out.println(year + " yılı artık yıl değildir.");

        }
    }
}