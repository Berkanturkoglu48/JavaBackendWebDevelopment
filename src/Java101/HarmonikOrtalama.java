package Java101;

public class HarmonikOrtalama {
    public static void main(String[] args) {

        double harmonicSum=0.0 ,harmonicAvarage ;
        int[] list = {2,4,6,8,10,12};
        for(int e : list){
            double result=0;
            int i = 1;
            while(i <= e){
                result += (1.0/i);
                i++;
            }
            harmonicSum+=result;
        }
        harmonicAvarage=(double)list.length / harmonicSum;
        System.out.println(harmonicAvarage);
    }


}
