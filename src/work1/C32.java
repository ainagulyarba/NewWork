package work1;

import java.util.Scanner;

public class C32 {
    public static void main(String[] args) {

     //  32----
     //  İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
     //  num1 = num2 => true

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 1.sayi giriniz: ");
        int num1= scan.nextInt();
        System.out.println("Lutfen 2.sayi giriniz: ");
        int num2= scan.nextInt();

        ikiSayiEsitMi(num1,num2);
    }

    private static void ikiSayiEsitMi(int num1, int num2) {

        System.out.println(num1==num2);
    }




    }



