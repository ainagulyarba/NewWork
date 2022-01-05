package work1;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
      //  11----
      //  Kullanıcıdan alınan Stringin son karakteirini silen ekrana yazan Java kodunu yazınız.
      //  Test Data:
      //  good
      //  Beklenen Çıktı:
      //  goo

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz: ");
        String str=scan.nextLine();
        System.out.println(str.substring(0,str.length()-1));

    }
}
