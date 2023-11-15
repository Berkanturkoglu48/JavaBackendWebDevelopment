package Java101;

import java.util.Scanner;
public class UceVeDordeBolunenlerinOrtalamasi {
    public static void main (String[] args){
        int k, total=0 ;
        double average, numbers=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayınızı giriniz :");
        k= input.nextInt();

        for (int i = 0 ; i <= k ;i++){
            if ((i%3 == 0)&& (i%4 == 0)){
                total += i;
                numbers++;

            }

        }
        average = total /numbers;

        System.out.println("Ortalama değeri :" + average);

    }
}