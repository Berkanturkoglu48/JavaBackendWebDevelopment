package Java101;
import java.util.Scanner;
public class RecursiveMetodIleUsluSayiHesabi {

    static int exp (int n1,int n2) {
        if (n2==0)
            return 1;

        return n1 * exp(n1,n2-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int base,exponent;

        System.out.println("Taban değerini giriniz");
        base = input.nextInt();

        System.out.println("Üs değerini giriniz");
        exponent = input.nextInt();

        System.out.println("Taban değeriniz : " + base +" Üs değeriniz : "+ exponent +" Sonucunuz : " + exp(base,exponent));

    }
}
