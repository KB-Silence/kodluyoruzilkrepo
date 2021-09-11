public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.printf("Akademisyen %s, %s dersine atandı.\n", teacher.name, this.name);
        } else {
            System.out.printf("Akademisyen %s, %s dersini veremez.\n", teacher.name, this.name);
        }
    }

    void printTeacher() {
        if (this.teacher != null) {
            System.out.printf("%s dersinin akademisyeni %s.\n", this.name, this.teacher.name);
        } else {
            System.out.printf("%s dersine akademisyen atanmamıştır.\n", this.name);
        }
    }
}
