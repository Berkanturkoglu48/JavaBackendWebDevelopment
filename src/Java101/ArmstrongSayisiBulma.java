package Java101;
import java.util.Scanner;
public class ArmstrongSayisiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, tempNumber, numberCounter = 0,armstrongNumber=0,lastNumber;

        System.out.println("Armstrong Sayısı Olup Olmadığını Kontrol Etmek İstediğiniz Sayıyı Giriniz :");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberCounter++;

        }

        tempNumber=number;

        while(tempNumber!=0){
            int tempTotal=1;
            lastNumber=tempNumber%10;
            for(int i=1;i <= numberCounter;i++){
                tempTotal*=lastNumber;

            }
            armstrongNumber += tempTotal;
            tempNumber /=10;

        }
        if(number == armstrongNumber) {
            System.out.println("Sayınız Armstrong Sayıdır.");

        }
        else {
            System.out.println("Sayınız Armstrong Sayı Değildir.");
        }

    }
}
