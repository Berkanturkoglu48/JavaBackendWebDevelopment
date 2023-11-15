package Java101;

import java.util.Scanner;

public class HarmonikSayilariBulma {
    public static void main(String[] args) {
        int number;
        double harmonicResult = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("N değerinizi giriniz : ");
        number = input.nextInt();

        int i =1;
        while(i <= number){
            harmonicResult += (1.0/i);
            i++;
        }

        System.out.println("Sonuç : " + harmonicResult);

    }
}
