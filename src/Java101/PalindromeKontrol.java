package Java101;
import java.util.Scanner;
public class PalindromeKontrol {

    static boolean isPalindrome(int number){
        int temp =number , lastNumber, reverseNumber = 0;

        while (temp !=0){
            lastNumber = temp % 10;

            reverseNumber= (reverseNumber * 10) + lastNumber;

            temp /= 10;
        }

        return number == reverseNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz :");
        int number = input.nextInt();

        System.out.println(isPalindrome(number));


    }
}
