import java.util.Locale;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String username = "berkcan", password = "123456", inputUsername, inputPassword, newPassword;
        char select = ' ';

        System.out.print("Kullanıcı Adınız: ");
        inputUsername = scn.nextLine();

        System.out.print("Şifeniz: ");
        inputPassword = scn.nextLine();

        if(!(username.equals(inputUsername)) || !(password.equals(inputPassword))) {
            System.out.println("Hatalı kullanıcı adı/şifre.");
        } else {
            System.out.println("Giriş yapıldı.");
        }

        if(!(password.equals(inputPassword))) {
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz?");
            System.out.print("Evet 'E/e' | Hayır 'H/h' : ");
            select = scn.next().toLowerCase().charAt(0);
        }

        switch (select) {
            case 'e':
                System.out.print("Yeni Şifrenizi Girin: ");
                newPassword = scn.next();
                if (newPassword.equals(inputPassword) || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre girin.");
                } else {
                    password = newPassword;
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
                break;
            case 'h':
                System.out.println("Bilgileri kontrol edip tekrar giriş yapmayı deneyin.");
                break;
            case ' ':
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
                break;
        }


    }
}
