package Java101;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int number1,number2,total=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz :");
        number1= input.nextInt();

        System.out.println("Üs olacak sayıyı giriniz :");
        number2= input.nextInt();

        for(int i = 1; i <= number2 ;i++){
            total*=number1;
        }
        System.out.println("Sonuç : " + total);

    }
}