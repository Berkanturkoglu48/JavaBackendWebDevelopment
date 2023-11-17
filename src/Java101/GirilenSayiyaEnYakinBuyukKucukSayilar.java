package Java101;
import java.util.Scanner;
import java.util.Arrays;
public class GirilenSayiyaEnYakinBuyukKucukSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int[] list = {10,15,100,80,960,45,2,333,8,7,745,110};
        int min,max;

        System.out.print("Sayınızı giriniz : ");
        number= input.nextInt();
        min=number;
        max=number;
        //Burada listemizi sort metoduyla sıralıyoruz.
        //Bu sıralı listeyi avantaj olarak kullanacağız.
        Arrays.sort(list);

        for(int eleman: list){
            if(eleman > number){
                max = eleman;
                //listemiz sıralı olduğu için kullanıcıdan aldığımız sayıdan ilk büyük satıdan sonra break komutunu koymalıyız
                break;
            }
        }

        for(int i = list.length-1; i >= 0; i--){
            if(list[i] < number){
                min = list[i];
                break;
            }}

        System.out.println("Girilen Sayıya En Yakın Küçük Sayı : " + min);
        System.out.println("Girilen Sayıya En Yakın Büyük Sayı : " + max);


    }


}
