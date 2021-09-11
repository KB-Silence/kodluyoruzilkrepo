public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            System.out.println("Mavi Köşede: " + this.fighter1.name + " Sağlık: " + this.fighter1.health);
            System.out.println("Kırmızı Köşede: " + this.fighter2.name + " Sağlık: " + this.fighter2.health);
            System.out.println("=".repeat(27));
            if (whoIsFirst()) {
                System.out.println(this.fighter1.name + " İlk başlayacak.");
                newRound(this.fighter1, this.fighter2);
            } else {
                System.out.println(this.fighter2.name + " İlk başlayacak.");
                newRound(this.fighter2, this.fighter1);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

    boolean whoIsFirst() {
        double randomNumber = Math.random() * 100;
        return randomNumber < 50;
    }

    void newRound(Fighter firstFighter, Fighter secondFighter) {
        while (true) {
            System.out.println("\n===== YENİ ROUND =====");
            secondFighter.health = firstFighter.hit(secondFighter);
            printHealth(secondFighter);
            if (isWin()) break;
            firstFighter.health = secondFighter.hit(firstFighter);
            printHealth(firstFighter);
            if (isWin()) break;
        }
    }

    boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println(fighter2.name + " kazandı!");
            return true;
        }
        if (this.fighter2.health == 0) {
            System.out.println(fighter1.name + " kazandı!");
            return true;
        }
        return false;
    }

    void printHealth(Fighter fighter) {
        System.out.println(fighter.name + " Sağlık: " + fighter.health);
        System.out.println("-".repeat(15));
    }
}
