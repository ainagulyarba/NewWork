package work1;

import java.util.Locale;
import java.util.Scanner;

public class C18 {
    public static void main(String[] args) {
     //  18----
     //  Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
     //  Test Data:
     //  java is fun
     //  Beklenen Çıktı:
     //  Stringdeki sesli harf sayısı: 4

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen harf giriniz");
        String str=scan.nextLine().toLowerCase(Locale.ROOT);
        String sesliHarf="aeiou";
        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if (sesliHarf.contains(str.substring(i,i+1))) {
                sayac ++;
            }

        }
        System.out.println(sayac);



    }
}
