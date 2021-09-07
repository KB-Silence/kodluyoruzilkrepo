import java.util.Scanner;

public class ATM_with_SWITCH {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tempBalance,
                select,
                right = 0,
                balance = 1500;

        String username = "patika", password = "dev123",
                inputUsername, inputPassword;

        System.out.println("Patika.Dev Bankacılık - Hoş Geldiniz!");
        System.out.println("Lütfen Kullanıcı Adı ve Şifrenizi Girin.");
        while (right < 3) {
            System.out.print("Kullanıcı Adınız: ");
            inputUsername = scan.nextLine();
            System.out.print("Şifreniz:  ");
            inputPassword = scan.nextLine();
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.printf("\nSayın %s Başarıyla Giriş Yaptınız.%n", username);
                System.out.println("---------------------");
                System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçin\n");
                do {
                    System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap");
                    System.out.print("-- Seçiminiz: ");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            tempBalance = 0;
                            System.out.println("---------------------");
                            while (true) {
                                System.out.print("Yatırmak İstediğiniz Miktarı Girin: ");
                                tempBalance = scan.nextInt();
                                if (tempBalance <= 0) {
                                    System.out.println("Hatalı miktar girişi yaptınız.");
                                    System.out.println("Yatırılacak tutar 0 veya 0'dan düşük miktarda olamaz.");
                                    System.out.println("---------------------");
                                    continue;
                                }
                                balance += tempBalance;
                                System.out.println("İşleminiz Başarıyla Gerçekleştirildi.");
                                System.out.printf("Mevcut Bakiyeniz: %s TL%n", balance);
                                System.out.println("---------------------");
                                break;
                            }
                            break;
                        case 2:
                            tempBalance = 0;
                            System.out.println("---------------------");
                            while (true) {
                                System.out.print("Çekmek İstediğiniz Miktarı Girin: ");
                                tempBalance = scan.nextInt();
                                if (balance - tempBalance < 0) {
                                    System.out.println("Yetersiz bakiye. İşlem tamamlanamadı.");
                                    System.out.printf("Mevcut Bakiyeniz: %s TL%n", balance);
                                    System.out.println("---------------------");
                                    continue;
                                }
                                balance -= tempBalance;
                                System.out.println("İşleminiz Başarıyla Gerçekleştirildi.");
                                System.out.println("Bölmeden paranızı alabilirsiniz.");
                                System.out.printf("Mevcut Bakiyeniz: %s TL%n", balance);
                                System.out.println("---------------------");
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("---------------------");
                            System.out.printf("Bakiyeniz: %s TL%n", balance);
                            System.out.println("---------------------");
                            break;
                        default:
                            break;
                    }
                } while (select != 4);
                System.out.printf("Hoşçakal %s. Tekrar Görüşmek Üzere.", username);
                break;
            }
            right++;
            System.out.printf("Hatalı Deneme: %s%n", right);
            if (right == 3) {
                System.out.println("3 defa hatalı giriş yapıldığından dolayı hesabınız bloke olmuştur.\nLütfen en yakın şubemize müracaat ediniz.");
            }
        }
    }
}
