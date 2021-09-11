import java.text.DecimalFormat;

public class Student {
    Course tarih;
    Course fizik;
    Course biyoloji;
    String name;
    String stuNo;
    String classes;
    double avarage;
    String format = "%-20s %-1s%n";

    Student(String name, String stuNo, String classes, Course tarih, Course fizik, Course biyoloji) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.tarih = tarih;
        this.fizik = fizik;
        this.biyoloji = biyoloji;
        this.avarage = 0;
    }

    boolean checkNotes(int note) {
        if (note >= 0 && note <= 100) return true;
        return false;
    }

    void addBulkExamNote(int tarihNote, int fizikNote, int biyolojiNote) {
        if (checkNotes(tarihNote)) {
            this.tarih.note = tarihNote;
        }
        if (checkNotes(fizikNote)) {
            this.fizik.note = fizikNote;
        }
        if (checkNotes(biyolojiNote)) {
            this.biyoloji.note = biyolojiNote;
        }
    }

    void addBulkVerbalNote(int tarihVerbal, int fizikVerbal, int biyolojiVerbal) {
        if (checkNotes(tarihVerbal)) {
            this.tarih.verbalNote = tarihVerbal;
        }
        if (checkNotes(fizikVerbal)) {
            this.fizik.verbalNote = fizikVerbal;
        }
        if (checkNotes(biyolojiVerbal)) {
            this.biyoloji.verbalNote = biyolojiVerbal;
        }
    }

    boolean checkIfPassed() {
        calcAvarage();
        return this.avarage > 55;
    }

    void isPass() {
        if (checkIfPassed()) {
            System.out.println("Hababam sınıfı uyanıyor.");
        } else {
            System.out.println("Hababam sınıfı, sınıfta kaldı.");
        }
    }

    void calcAvarage() {
        double tempTarihNote = (this.tarih.verbalNote * 0.20) + (this.tarih.note * 0.80);
        double tempFizikNote = (this.fizik.verbalNote * 0.20) + (this.fizik.note * 0.80);
        double tempBiyoNote = (this.biyoloji.verbalNote * 0.20) + (this.biyoloji.note * 0.80);
        this.avarage = (tempTarihNote + tempFizikNote + tempBiyoNote) / 3;
    }

    void printNote() {
        System.out.println("=".repeat(50));
        System.out.println("Ortalamaya Sınav Notu: %80 | Sözlü Notu: %20 Etki Etmektedir.");
        System.out.println("Öğrenci: " + this.name);
        System.out.print("Durum: ");
        isPass();
        System.out.println("=".repeat(50));
        System.out.format(format, "Sınav Notu", "Sözlü Notu");
        System.out.format(format, this.tarih.note, this.tarih.verbalNote);
        System.out.format(format, this.fizik.note, this.fizik.verbalNote);
        System.out.format(format, this.biyoloji.note, this.biyoloji.verbalNote);
        System.out.println("-".repeat(33));
        System.out.format("Ortalamanız: %s\n\n", new DecimalFormat("##.##").format(this.avarage));
    }
}