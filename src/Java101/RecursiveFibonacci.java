package Java101;

public class RecursiveFibonacci {

    static int fibonacci(int number){

        if ((number==2) || (number==1)){

            return 1;
        }

        return fibonacci(number-1) + fibonacci(number-2);
    }
    public static void main(String[] args) {

        System.out.println(fibonacci(7));
    }
}
