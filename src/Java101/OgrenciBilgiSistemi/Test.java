package Java101.OgrenciBilgiSistemi;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hasan ", "0530564654654", "TRH");
        Teacher t2 = new Teacher("Hüseyin ", "0534654", "FZK");
        Teacher t3 = new Teacher("Berkan","45877844554","MAT");


        Course fizik = new Course("Fizik","101","FZK",0.8);
        Course tarih = new Course("Tarih","102","TRH",0.7);
        Course matematik = new Course("Matematik","103","MAT",0.6);

        fizik.addTeacher(t2);
        tarih.addTeacher(t1);
        matematik.addTeacher(t3);

        Student s1 = new Student("Berkan Türkoğlu","170412037","4",tarih,fizik,matematik);
        s1.addBulkExamNote(100,50,34,65,50,90);
        s1.printNote();
        s1.isPassStatus();

        Student s2 = new Student("Kağan Türkoğlu","170037","1",tarih,fizik,matematik);
        s2.addBulkExamNote(95,60,80,50,80,70);
        s2.printNote();
        s1.isPassStatus();

        Student s3 = new Student("Ali","575445"," 2",tarih,fizik,matematik);
        s2.addBulkExamNote(50,60,70,80,90,40);
        s3.printNote();
        s1.isPassStatus();

        
        fizik.printTeacher();



    }





}
