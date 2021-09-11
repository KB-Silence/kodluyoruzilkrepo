public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mahmut Hoca", "TRH", "+905123458877");
        Teacher teacher2 = new Teacher("Paşa Nuri", "FZK", "+905378986611");
        Teacher teacher3 = new Teacher("Kül Yutmaz", "BIO", "+905314684512");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyo = new Course("Biyoloji", "101", "BIO");
        tarih.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        biyo.addTeacher(teacher1);
        biyo.addTeacher(teacher3);

        Student student1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        student1.addBulkExamNote(100, 78, 58);
        student1.addBulkVerbalNote(80, 57, 84);
        student1.printNote();

        Student student2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
        student2.addBulkExamNote(79, 34, 48);
        student2.addBulkVerbalNote(92, 26, 29);
        student2.printNote();
    }
}
