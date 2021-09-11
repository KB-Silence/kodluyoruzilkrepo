public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 20, 120, 90, 40);
        Fighter f2 = new Fighter("Mike Tyson", 25, 100, 95, 30);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
