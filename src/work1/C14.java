package work1;

import java.util.Scanner;

public class C14 {
    public static void main(String[] args) {

      // 14----
      // Girilen iki String veriyi karşılaştıran Java kodu yazınız.
      // Test data:
      // 1. String : techproed.com
      // 2. String : Techproed.com
      // Beklenen Çıktı:
      // False
      // Test data:
      // 1. String : techproed.com
      // 2. String : techproed.com
      // Beklenen Çıktı:
      // true
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz: ");
        String str=scan.nextLine();
        System.out.println("Lutfen cumle giriniz: ");
        String str1= scan.nextLine();
        System.out.println(str.equals(str1));


    }
}
