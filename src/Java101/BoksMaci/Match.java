package Java101.BoksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1 , Fighter f2 , int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    void run(){
        if(isCheck()){
            while((this.f1.health > 0) && (this.f2.health > 0)){
                System.out.println("Yeni Round");

                if (whoRun()<= 50){
                    this.f2.health=this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }
                else{
                    this.f1.health=this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                }

                System.out.println(this.f1.name + " Canı : "+ this.f1.health +" " + this.f2.name + " Canı : "+ this.f2.health);
            }
        }
        else{
            System.out.println("Siklet uyumsuzluğu sebebiyle dövüş yapılamaz");
        }
    }
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " Kazandı !");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " Kazandı !");
            return true;
        }
        return false;
    }
    double whoRun(){
        return Math.random()*100;
    }
}
