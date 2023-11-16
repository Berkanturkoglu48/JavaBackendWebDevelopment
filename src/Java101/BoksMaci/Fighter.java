package Java101.BoksMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int damage,int health,int weight,int dodge){
        this.damage=damage;
        this.health=health;
        this.name=name;
        this.weight=weight;
        if (dodge <=100 && dodge >= 0 ){
            this.dodge=dodge;
        }
        else{
            this.dodge=0;
        }
    }int hit(Fighter foe){
        System.out.println(this.name + " -> " + foe.name + " " + this.damage + " Hasar Vurdu !");

        if (foe.isDodge()){
            System.out.println(foe.name + " Hasarı Blokladı !");
            return foe.health;
        }
        return Math.max(foe.health - this.damage, 0);
    }
    boolean isDodge(){
        double randomNumber= Math.random() *100;
        return randomNumber <= this.dodge;

    }
}
