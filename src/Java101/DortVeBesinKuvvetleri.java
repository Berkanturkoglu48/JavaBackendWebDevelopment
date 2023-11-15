package Java101;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int limit;

        Scanner input = new Scanner(System.in);

        System.out.println("Limit değerini giriniz :");
        limit = input.nextInt();

        for (int i = 1,j = 1 ; i<= limit && j<=limit ;i*=4,j*=5){

            System.out.println(i + " " + j);
        }



    }
}