public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter fighter) {
        System.out.println(this.name + " => " + fighter.name + " " + this.damage + " hasar vurdu.");
        if (fighter.isDodge()) {
            System.out.println(fighter.name + " gelen hasarı blokladı.");
            return fighter.health;
        }
        if (fighter.health - this.damage < 0) {
            return 0;
        }
        return fighter.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
