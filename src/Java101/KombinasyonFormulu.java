package Java101;

import java.util.Scanner;

public class KombinasyonFormulu {
    public static void main(String[] args) {
        int n , r ;
        int nFactoriel=1;
        double combination,rFactoriel=1,n_rFactoriel=1;
        Scanner input = new Scanner(System.in);

        System.out.print("1. değeri giriniz (n):");
        n= input.nextInt();

        System.out.print("2. değeri giriniz(r) :");
        r= input.nextInt();

        for( int i = 1 ; i<= n ; i++){
            nFactoriel *=i;

        }
        for( int j = 1 ; j<= r ; j++){
            rFactoriel *=j;

        }
        for( int k = 1 ; k<= (n-r) ; k++){
            n_rFactoriel *=k;

        }

        combination = nFactoriel /(rFactoriel*n_rFactoriel);

        System.out.println("Sonuç = "+ combination);
    }


}