package work1;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {

     //  0-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
     //  Test Data:
     //  Java is easy
     //  Aranan String: is
     //  Bektenen Çıktı:
     //  True
     //  Aranan String: and
     //  Beklenen Çıktı:False

    Scanner scan =new Scanner(System.in);
    System.out.println("Lutfen cumle giriniz: ");
    String str=scan.nextLine();
    System.out.println("Lutfen aradiginiz kelimeyi giriniz: ");
    String str1= scan.next();

            if (str.contains(str1)) {
                System.out.println("true");
            } else{
                    System.out.println("false");
                }
        }



    }

