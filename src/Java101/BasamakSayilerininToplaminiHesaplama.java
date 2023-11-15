package Java101;
import java.util.Scanner;
public class BasamakSayilerininToplaminiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number,lastNumber,total =0;

        System.out.println("Hesaplama yapacağım sayıyı giriniz :");
        number = input.nextInt();

        while(number !=0){
            lastNumber = number%10;
            total +=lastNumber;

            number /=10;
        }

        System.out.println("Sayınızın Basamakları Toplamı :" + total);

    }
}
