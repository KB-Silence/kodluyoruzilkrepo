import java.util.Calendar;

public class Employee {
    String employeeName;
    double salary;
    int workHours;
    int hireYear;
    int minWorkHours;
    int currentYear;

    Employee(String employeeName, double salary, int workHours, int hireYear) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        this.minWorkHours = 40;
        this.currentYear = Calendar.getInstance().getWeekYear();
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    double bonus() {
        if (this.minWorkHours > this.workHours) {
            return 0;
        }
        return (this.workHours - this.minWorkHours) * 30;
    }

    double raiseSalary() {
        int year = this.currentYear - this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        } else if (year > 9 && year < 20) {
            return this.salary * 0.10;
        }
        return this.salary * 0.15;
    }

    double calculateFinalSalary() {
        double finalSalary = (this.salary + raiseSalary() + bonus()) - tax();
        return finalSalary;
    }

    void printEmployeeInfo() {
        System.out.println("Adı: " + this.employeeName);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Maaşı: " + this.salary + " TL");
        System.out.println("=".repeat(20));
        System.out.println("Vergi: " + tax() + " TL");
        System.out.println("Bonus: " + bonus() + " TL");
        System.out.println("Yıl Bazlı Maaş Artışı: " + raiseSalary() + " TL");
        System.out.println("Vergi ve Bonus Değişiminden Sonra Maaş: " + ((this.salary + bonus()) - tax()) + " TL");
        System.out.println("Toplam Maaş: " + calculateFinalSalary() + " TL");
    }

}
