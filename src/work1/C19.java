package work1;

import java.util.Locale;
import java.util.Scanner;

public class C19 {
    public static void main(String[] args) {
     //  19----
     //  Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.
     //  Test Data:
     //  2017
     //  Beklenen Çıktı:
     //  false

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil=scan.nextInt();

            System.out.println(yil%4==0);



    }
}
