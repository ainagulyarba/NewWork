package work1;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

      //  6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
      //          değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
      //  1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
      //  Sesli harfler: a,e,i,o,u
      //  Test Data:
      //  a
      //  Beklenen Çıktı:
      //  a harfi sesli harfdir.
      //  Test Data:
      //  d
      //  Beklenen Çıktı:
      //  d harfi sesiz harftir.
      //  Test Data:
      //  we  yada %
      //  Beklenen Çıktı:
      //  Yanlis karakter girdiniz!

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen harf giriniz");
        String harf=scan.next().toLowerCase();
        String sesliHarf="aeiou";
        String sessizHarf="zrtpqsdfghjklmwxcvbn";
        if (harf.length()>1) {
            System.out.println("birden fazla karakter girdiniz");
        }else if (sesliHarf.contains(harf)){
            System.out.println("girilen harf seslidir");
        }else if (sessizHarf.contains(harf)) {
            System.out.println("girilen harf sessizdir");
        }else {
            System.out.println("yanlis karakter girdiniz");
        }

    }
}
