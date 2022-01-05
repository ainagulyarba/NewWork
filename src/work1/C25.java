package work1;

import java.util.Scanner;

public class C25 {
    public static void main(String[] args) {

     //   25----
     //   Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
     //   Array: [12,15,43,23,56,76,78,90,77,43]
     //   Aranan değer:56
     //   Beklenen Çıktı:
     //   56 sayısı arrayin 4. elemanı

        int arr[]={12,15,43,23,56,76,78,90,77,43};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aradiginiz sayiyi giriniz: ");
        int sayi= scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==sayi){
                System.out.println(sayi+" sayisi arrayin "+i+".elemani");
            }

        }


    }
}
