package Java101.OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name , String stuNo,String classes,Course c1,Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1, int note2 ,int note3,int sozluNote1,int sozluNote2,int sozluNote3){
        if((note1 >= 0)&& (note1 <= 100)){
            this.c1.note=note1;
        }
        if((note2 >= 0)&& (note2 <= 100)){
            this.c2.note=note2;
        }
        if((note3 >= 0)&& (note3<= 100)){
            this.c3.note=note3;
        }
        if((sozluNote1 >= 0)&& (sozluNote1<= 100)){
            this.c1.sozluNotu=sozluNote1;
        }
        if((sozluNote2 >= 0)&& (sozluNote2<= 100)){
            this.c2.sozluNotu=sozluNote2;
        }
        if((sozluNote3 >= 0)&& (sozluNote3<= 100)){
            this.c3.sozluNotu=sozluNote3;
        }

    }
    void printNote(){
        System.out.println(this.name);
        System.out.println(this.c1.name + " Notu\t: " + this.c1.note);
        System.out.println(this.c2.name + " Notu\t: " + this.c2.note);
        System.out.println(this.c3.name + " Notu\t: " + this.c3.note);
        System.out.println(this.c1.name + " Sözlü Notu\t: " + this.c1.sozluNotu);
        System.out.println(this.c2.name + " Sözlü Notu\t: " + this.c2.sozluNotu);
        System.out.println(this.c3.name + " Sözlü Notu\t: " + this.c3.sozluNotu);
        System.out.println("Ortalamanız : " + calcAvarage());
        System.out.println(" ");

    }
    double calcAvarage(){
        this.avarage=(((c1.note *c1.impact) + c1.sozluNotu * (1 - c1.impact))
                + ((c2.note *c2.impact) + c2.sozluNotu * (1 - c2.impact))
                + ((c3.note *c3.impact) + c3.sozluNotu * (1 - c3.impact)))/3.0;
        return this.avarage;
    }
    void isPassStatus(){
        if(calcAvarage() >= 55){
            System.out.println("Geçti\n");
            this.isPass=true;
        }
        else {
            System.out.println("Kaldı\n");
            this.isPass= false;
        }

    }
}
