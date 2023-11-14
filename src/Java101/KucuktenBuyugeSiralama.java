package Java101;
import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı girin:");
        a=input.nextInt();

        System.out.println("2.Sayıyı girin:");
        b=input.nextInt();

        System.out.println("3.Sayıyı girin:");
        c=input.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("Küçükten büyüğe sıralama şu şekildedir : a < b < c ");
            }else {
                System.out.println("Küçükten büyüğe sıralama şu şekildedir : a < c < b ");
            }
        }
        else if ((b<a) && (b<c)){
            if (a<c){
                System.out.println("Küçükten büyüğe sıralama şu şekildedir : b < a < c ");
            }else {
                System.out.println("Küçükten büyüğe sıralama şu şekildedir : b < c < a ");
            }
        }
        else {
            if (a<b){
                System.out.println("Küçükten büyüğe sıralama şu şekildedir : c < a < b ");
            }else {
                System.out.println("Küçükten büyüğe sıralama şu şekildedir : c < b < a ");
            }
        }


    }
}