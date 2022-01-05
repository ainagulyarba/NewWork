package work1;

import java.util.Scanner;

public class C16 {
    public static void main(String[] args) {
     //   16----
     //   Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
     //   Test Data:
     //   java is fun
//
     //   Beklenen Çıktı:
     //   JAVA IS FUN

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz: ");
        String str = scan.nextLine();
        System.out.println(str.toUpperCase());

    }
}
