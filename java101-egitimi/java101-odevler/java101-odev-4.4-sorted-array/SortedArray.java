import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] list;
        int tempValue;

        System.out.print("Dizinin Boyutunu Girin: ");
        int listLength = scan.nextInt();

        list = new int[listLength];

        for (int i = 0; i < listLength; i++) {
            System.out.printf("%s. Elemanı Girin: ", i + 1);
            list[i] = scan.nextInt();
        }

        for (int i = 0; i < listLength - 1; i++) {
            for (int j = i + 1; j < listLength; j++) {
                if (list[j] < list[i]) {
                    tempValue = list[i];
                    list[i] = list[j];
                    list[j] = tempValue;
                }
            }
        }
        /*  listLength = 5 olarak ele alalım.
            (i) 0 dan başlayacak ve listLength - 1 (5 - 1 = 4) 'den küçük olduğu sürece çalışacak. Her seferinde bir bir artacak. ** Koşulun neden listLength - 1 olduğu akış sonunda açıklandı.
                (j) i + 1 den başlayacak ve listLength(5)'ten küçük olduğu sürece çalışacak. Her seferinde bir bir artacak.

            list elemanlarını = 99, -2, -2121, 1, 0   olarak ele alalım.
            (i 0 dan başladı - - - j i+1(1)'den başladı)

            i = 0 - - - j = 1
                if (list[1] < list[0])          -->         (list[1] = -2) < (list[0] = 99) --> Kontrol Sonucu: True
                    tempValue = list[0]         -->         tempValue = 99
                    list[0] = list[1]           -->         list[0] = -2    -->     list = -2, -2, -2121, 1, 0
                    list[1] = tempValue         -->         list[1] = 99    -->     list = -2, 99, -2121, 1, 0      --> j bir arttı ve j = 2 oldu.

               if (list[2] < list[0])           -->         (list[2] = -2121) < (list[0] = -2) --> Kontrol Sonucu: True
                    tempValue = list[0]         -->         tempValue = -2
                    list[0] = list[2]           -->         list[0] = -2121     --> list = -2121, 99 -2121, 1, 0
                    list[2] = tempValue         -->         list[2] = -2        --> list = -2121, 99, -2, 1, 0      --> j bir arttı ve j = 3 oldu.

               if (list[3] < list[0])            -->         (list[3] = 1) < (list[0] = -2121) --> Kontrol Sonucu: False     --> j bir arttı ve j = 4 oldu.
               if (list[4] < list[0])            -->         (list[4] = 0) < (list[0] = -2121) --> Kontrol Sonucu: False     --> j bir arttı ve j = 5 oldu.
               j = 5 olduğu için koşul sağlanmadı ve döngü bozuldu   -->  i bir arttı ve i = 1 oldu.

            i = 1 - - - j = 2
               if (list[2] < list[1])           -->         (list[2] = -2) < (list[1] = 99) --> Kontrol Sonucu: True
                    tempValue = list[1]         -->         tempValue = 99
                    list[1] = list[2]           -->         list[1] = -2        --> list = -2121, -2, -2, 1, 0
                    list[2] = tempValue         -->         list[2] = 99        --> list = -2121, -2, 99, 1, 0      --> j bir arttı ve j = 3 oldu

               if (list[3] < list[1])           -->         (list[3] = 1) < (list[1] = -2) --> Kontrol Sonucu: False    --> j bir arttı ve j = 4 oldu
               if (list[4] < list[1])           -->         (list[4] = 0) < (list[1] = -2) --> Kontrol Sonucu: False    --> j bir arttı ve j = 5 oldu
               j = 5 olduğu için koşul sağlanmadı ve döngü bozuldu  --> i bir arttı ve i = 2 oldu

            i = 2 - - - j = 3
                if(list[3] < list[2])           -->         (list[3] = 1) < (list[2] = 99) --> Kontrol Sonucu: True
                    tempValue = list[2]         -->         tempValue = 99
                    list[2] = list[3]           -->         list[2] = 1         --> list = -2121, -2, 1, 1, 0
                    list[3] = tempValue         -->         list[3] = 99        --> list = -2121, -2, 1, 99, 0      --> j bir arttı ve j = 4 oldu

                if(list[4] < list[2])           -->         (list[4] = 0) < (list[2] = 1) --> Kontrol Sonucu: True
                    tempValue = list[2]         -->         tempValue = 1
                    list[2] = list[4]           -->         list[2] = 0         --> list = -2121, -2, 0, 99, 0
                    list[4] = tempValue         -->         list[4] = 1         --> list = -2121, -2, 0, 99, 1      --> j bir arttı ve j = 5 oldu
                j = 5 olduğu için koşul sağlanmadı ve döngü bozuldu  --> i bir arttı ve i = 3 oldu

            i = 3 - - - j = 4
                if(list[4] < list[3])           -->         (list[4] = 1) < (list[3] = 99) --> Kontrol Sonucu: True
                    tempValue = list[3]         -->         tempValue = 99
                    list[3] = list[4]           -->         list[3] = 1         --> list = -2121, -2, 0, 1, 1
                    list[4] = tempValue         -->         list[4] = 99        --> list = -2121, -2, 0, 1, 99      --> j bir arttı ve j = 5 oldu
                j = 5 olduğu için koşul sağlanmadı ve döngü bozuldu --> i bir arttı ve i = 4 oldu.

                (i) döngüsünün koşulunu direkt ( i < listLength ) olarak verseydik;
                İkinci döngünün başlangıç değeri (i + 1) yani i = 4 olduğu için son turda başlangıç değeri 4 + 1 = 5 oluyor.
                Fakat döngünün koşulu j < listLength(5) olduğu için koşulu sağlamayacak ve program (j) döngüsüne girmeden devam edecek.
                Yapacak başka işlem olmadığı için başa dönecek ve i 'yi tekrar bir arttıracak 5 yapacak ve koşul sağlanmayacağı için döngüden çıkacaktı.
                Yani döngü 4. turunda ( i=0, i=1, i=2,i=3 ) işlemi bitirdi fakat boş yere bir kere daha dönmüş oldu (i=4).
                Bunun önüne geçmek için (i) döngüsünün koşuluna listLength - 1 verdik bu sayede işlem bitince döngü de sonlanmış oldu.(i=0, i=1, i=2, i=3)

                Bütün bu akış sonucunda;
                    listenin ilk hali = {99, -2, -2121, 1, 0}
                    listenin son hali = {-2121, -2, 0, 1, 99}
        */

        System.out.print("Sıralama: ");
        for (int value : list) {
            System.out.printf("%s, ", value);
        }
        System.out.print("\b\b");
        // Son olarak listeyi yan yana yazdırdık. \b operatörü bir önceki karakteri silmeye yarıyor, 2 kere kullanımda en son eklenecek boşluk ve "," karakterlerini sildim.
    }
}
