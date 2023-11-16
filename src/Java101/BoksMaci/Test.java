package Java101.BoksMaci;

public class Test {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("ALİ",14,100,93,65);
        Fighter f2 = new Fighter("VELİ",10,191,70,50);

        Match m1 = new Match(f1,f2,70,130);

        m1.run();
    }

}
