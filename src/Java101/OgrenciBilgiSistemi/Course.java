package Java101.OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;
    double impact;
    Course(String name , String code , String prefix,double impact){
        this.code=code;
        this.name=name;
        this.prefix=prefix;
        this.note=0;
        this.sozluNotu=0;
        this.impact=impact;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }
    void printTeacher() {
        this.teacher.printInfo();

    }
}
