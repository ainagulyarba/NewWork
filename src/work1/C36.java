package work1;

import java.util.Scanner;

public class C36 {
    public static void main(String[] args) {

     //   36-----
     //   Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
     //   Test Data:
     //   isPrime(31)
     //   true
     //   isPrime(18)
     //   false

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(asalSayi(sayi));
    }

    private static boolean asalSayi(int sayi) {

        boolean flag = true;
        for (int i = 2; i < sayi; i++) {
            System.out.println(i);
            if (sayi % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;

    }
}
