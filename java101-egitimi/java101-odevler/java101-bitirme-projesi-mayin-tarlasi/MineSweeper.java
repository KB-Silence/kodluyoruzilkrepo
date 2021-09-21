import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    // Enjeksiyonlar
    Scanner scan = new Scanner(System.in); // Oyuncudan değerleri almak için.
    Random random = new Random(); // Rastgele değerler üretmek için.

    // Sabitler
    String DIVIDER = "-".repeat(40); // Görsellik için.
    int MINE_ASCII = 42; // "*" karakterinin ASCII kodu.

    // Değişkenler
    int[][] gameArea;  // Oyun alanının oluşturulması için.
    int row;           // Oyun alanı için oyuncudan alınan satır değeri.
    int selectedRow;   // Oyun sırasında oyuncunun seçtiği satır değeri.
    int randomRow;     // Mayın yerleştirmek için rastgele satır değeri.
    int col;           // Oyun alanı için oyuncudan alınan sütun değeri.
    int selectedCol;   // Oyun sırasında oyuncunun seçtiği sütun değeri.
    int randomCol;     // Mayın yerleştirmek için rastgele sütun değeri.
    int mineAround;    // Etraftaki mayınların sayısını tutmak için.
    int totalElement;  // Matrisin toplam eleman sayısını tutmak için.

    // Oyunu başlatacak metot.
    void startNewGame() {
        createGameArea();
        while (!isWin()) {
            System.out.printf("Satır için %s ile %s arasında seçim yapabilirsiniz.\n", 0, this.row - 1);
            System.out.printf("Sütun için %s ile %s arasında seçim yapabilirsiniz.\n", 0, this.col - 1);
            printGameArea();
            choosePoint();
            if (isGameOver()) {
                break;
            }
            this.gameArea[this.selectedRow][this.selectedCol] = calculateMineAround(this.selectedRow, this.selectedCol);
        }
    }

    // Matrisi oyuna hazır hale getirecek metot.
    void createGameArea() {
        getValuesGameArea();
        System.out.printf("%s\nOyun alanı oluşturuldu.\n", DIVIDER);
        fillGameArea();
        System.out.println("Mayınlar yerleştirildi.");
        System.out.printf("Oyun Başlıyor.\n%s\n", DIVIDER);
    }

    // Oyuncudan matris için satır ve sütün sayısını alıp, matrisi tamamlayacak metot.
    void getValuesGameArea() {
        do {
            System.out.println("Oyun Alanı İçin");
            System.out.print("Satır Bilgisini Girin: ");
            this.row = scan.nextInt();
            System.out.print("Sütun Bilgisini Girin: ");
            this.col = scan.nextInt();
        } while (!checkGameArea(this.row, this.col));
        this.gameArea = new int[this.row][this.col];
    }

    // Matris oluşturulurken girilen satır ve sütun değerlerini kontrol edecek metot.
    // En az 2x2 lik matrise mayın(1) koyulabileceği için 2 den az değer girildiğinde uyarı verecek ve tekrar değer girilmesini isteyecek.
    boolean checkGameArea(int row, int col) {
        if (row < 2 || col < 2) {
            System.out.printf("%s\nOyun alanı en az 2 satır ve 2 sütundan oluşmalıdır.\n%s\n", DIVIDER, DIVIDER);
            return false;
        }
        return true;
    }

    // Oyun alanına mayınları yerleştirecek metot.
    void fillGameArea() {
        // Konsolda "-" ile gösterebilmek için dizinin bütün elemanlarını 9 a eşitledim.
        // Seçilen alanın etrafında maksimum 8 mayın olabileceğinden dolayı konsola mayın adedini yazdırırken ve "-" karaterini kullanırken daha esnek olabilmek için 9 u seçtim.
        for (int[] row : this.gameArea) {
            Arrays.fill(row, 9);
        }

        // Yerleştirilecek mayın sayısını hesaplayıp, matris içine rastgele yerleştirdim.
        // Eğer rastgele değer üretirken önceden mayın yerleştirilmiş satır-sütuna denk gelirsek if mekanizması ile o satır-sütunu atladım.
        for (int i = 0; i < calculateMineAmount(this.gameArea); i++) {
            this.randomRow = random.nextInt(this.row);
            this.randomCol = random.nextInt(this.col);
            if (this.gameArea[this.randomRow][this.randomCol] == this.MINE_ASCII) {
                i -= 1;
                continue;
            }
            this.gameArea[this.randomRow][this.randomCol] = this.MINE_ASCII;
        }
    }

    // Girilen satır-sütun sayısına göre kaç adet mayın koyulacağını hesaplayacak metot.
    int calculateMineAmount(int[][] arr) {
        this.totalElement = arr.length * arr[0].length;
        return this.totalElement / 4;
    }

    // Oyuncunun matristen nokta seçmesi için çalışacak metot.
    void choosePoint() {
        do {
            System.out.print("Satır Seçin: ");
            this.selectedRow = scan.nextInt();
            System.out.print("Sütun Seçin: ");
            this.selectedCol = scan.nextInt();
        } while (!isValidMove(this.selectedRow, this.selectedCol));
    }

    // Oyuncunun seçtiği noktanım matris dahilinde olup olmadığını kontrol edecek metot.
    boolean isValidMove(int row, int col) {
        if ((row < 0 || row >= this.row) || (col < 0 || col >= this.col)) {
            System.out.println("Hatalı Nokta Seçimi Yapıldı. Lütfen Tekrar deneyin.");
            return false;
        }
        return true;
    }

    // Etraftaki mayınları hesaplayacak metot
    int calculateMineAround(int selectedRow, int selectedCol) {
        this.mineAround = 0;
        if ((selectedCol - 1 >= 0) && (this.gameArea[selectedRow][selectedCol - 1] == this.MINE_ASCII)) { // sol taraf için kontrol
            this.mineAround++;
        }
        if ((selectedCol + 1 < col) && (this.gameArea[selectedRow][selectedCol + 1] == this.MINE_ASCII)) { // sağ taraf için kontrol
            this.mineAround++;
        }
        if ((selectedRow - 1 >= 0) && (this.gameArea[selectedRow - 1][selectedCol] == this.MINE_ASCII)) { // üst taraf için kontrol
            this.mineAround++;
        }
        if ((selectedRow + 1 < row) && (this.gameArea[selectedRow + 1][selectedCol] == this.MINE_ASCII)) { // alt taraf için kontrol
            this.mineAround++;
        }
        if (((selectedRow - 1 >= 0) && (selectedCol - 1 >= 0)) && (this.gameArea[selectedRow - 1][selectedCol - 1] == this.MINE_ASCII)) { // sol üst köşe için kontrol
            this.mineAround++;
        }
        if (((selectedRow + 1 < row) && (selectedCol - 1 >= 0)) && (this.gameArea[selectedRow + 1][selectedCol - 1] == this.MINE_ASCII)) { // sol alt köşe için kontrol
            this.mineAround++;
        }
        if (((selectedRow - 1 >= 0) && (selectedCol + 1 < col)) && (this.gameArea[selectedRow - 1][selectedCol + 1] == this.MINE_ASCII)) { // sağ üst köşe için kontrol
            this.mineAround++;
        }
        if (((selectedRow + 1 < row) && (selectedCol + 1 < col)) && (this.gameArea[selectedRow + 1][selectedCol + 1] == this.MINE_ASCII)) { // sağ alt köşe için kontrol
            this.mineAround++;
        }
        return this.mineAround;
    }

    // Oyuncunun bütün kutuları açıp açmadığını kontrol edecek metot.
    boolean isWin() {
        for (int[] row : this.gameArea) {
            for (int col : row) {
                if (col == 9) {
                    return false;
                }
            }
        }
        printEndGameArea();
        System.out.println("Tebrikler Oyunu Kazandınız.");
        return true;
    }

    // Oyuncunun mayına basıp basmadığını kontrol edecek metot.
    boolean isGameOver() {
        if (this.gameArea[selectedRow][selectedCol] == this.MINE_ASCII) {
            printEndGameArea();
            System.out.println("Mayına Bastınız. Oyun bitti.");
            return true;
        }
        return false;
    }

    // Diziyi ekrana yazdıracak metot.
    void printGameArea() {
        System.out.println("=".repeat((this.col * 3) + 2));
        for (int[] row : this.gameArea) {
            System.out.print("|");
            for (int col : row) {
                if (col > 8) {
                    System.out.print(" -" + " ".repeat(1));
                } else {
                    System.out.print(" " + col + " ".repeat(1));
                }
            }
            System.out.println("|");
        }
        System.out.println("=".repeat((this.col * 3) + 2));
    }

    // Oyun sonu diziyi ekrana yazdıracak metot.
    void printEndGameArea() {
        System.out.println("=".repeat((this.col * 3) + 2));
        for (int[] row : this.gameArea) {
            System.out.print("|");
            for (int col : row) {
                if (col == this.MINE_ASCII) {
                    System.out.print(" *" + " ".repeat(1));
                } else if (col == 9) {
                    System.out.print(" -" + " ".repeat(1));
                } else {
                    System.out.print(" " + col + " ".repeat(1));
                }
            }
            System.out.println("|");
        }
        System.out.println("=".repeat((this.col * 3) + 2));
    }
}
