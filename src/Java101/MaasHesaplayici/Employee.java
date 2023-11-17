package Java101.MaasHesaplayici;
import java.time.LocalDate;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.hireYear=hireYear;
        this.workHours=workHours;

    }
    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
    int bonus(){
        if (this.workHours >40){
            return (this.workHours - 40)*30;
        }
        else {
            return 0;
        }
    }
    double raiseSalary(){
        int currentYear=LocalDate.now().getYear();
        int year = currentYear -this.hireYear;
        if(year < 10) {
            return this.salary * 0.05;
        }
        else if (year < 19 ){
            return this.salary * 0.1;
        }
        else{
            return this.salary *0.2;
        }
    }
    void tooString(){
        System.out.println("Çalışanın Adı : " +this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati : "+ this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : "+ this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş : " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam Maaş : "+ (this.salary + this.bonus() + this.raiseSalary() - this.tax()));
    }

}
