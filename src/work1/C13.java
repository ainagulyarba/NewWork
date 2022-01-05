package work1;

import java.util.Locale;
import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {

     //   13----
     //   Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru
     //   okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
     //   Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
     //   Test Data:
     //   madam
     //   Beklenen Çıktı:
     //   True

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz: ");
        String str=scan.nextLine();
        String ters ="";
        for (int i = str.length()-1; i >=0 ; i--) {
           ters+=str.charAt(i);

            }

            if (str.equalsIgnoreCase(ters)) {
                System.out.println("Girdiginiz string polindrom'dur");
            }else {
                System.out.println("Girdiginiz string polindrom degildir");

        }


    }
}
