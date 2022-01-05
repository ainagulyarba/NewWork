package work1;

import java.util.Locale;
import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
      //  12----
      //  Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.
      //  Test Data:
      //  Java is fun
      //  Beklenen Sonuç:
      //  JAVA IS FUN

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz: ");
        String str=scan.nextLine().toUpperCase(Locale.ROOT);

        System.out.println(str);
    }
}
