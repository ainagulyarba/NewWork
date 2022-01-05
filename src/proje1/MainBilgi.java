package proje1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class MainBilgi {

    static Scanner scan =new Scanner(System.in);

    static Map<Integer,Bilgi> kisiBilgisi= new HashMap<>();
    //   kisiBilgisi.put(1001,"Ayse Soylu, Baris Cad.No5, 075467341");
    //   kisiBilgisi.put(1002,"Salih Hikmet, Unlu Cad.No8, 078536246");
    //   kisiBilgisi.put(1003,"Hakan Sari, Lale Cad.No4, 079642753");
    //   kisiBilgisi.put(1004,"Ali Can, Sevgi Cad.No2, 078537541");
    //   kisiBilgisi.put(1005,"Zeliha Can, Dolu Cad.No11, 073385741");

    public static void main(String[] args) {

        selectOption();


    }

    private static void selectOption() {

        System.out.println("***************KISI BILGISI********************");
        System.out.println("Lutfen istediginiz isleminizi giriniz:\n1-Kisi Bilgisi Ekle\n2-Kimlik No ile Kisi Bilgilerine Ulasma" +
                "\n3-Kimlik No ile Kisi Bilgilerini Silme");
        int secim =scan.nextInt();
       switch (secim){
           case 1:
               bilgiEkle(kisiBilgisi);
               break;
           case 2:
               getInfo(kisiBilgisi);
               break;
           case 3:
               removeInfo(kisiBilgisi);
               break;
           default:
               System.out.println("Yalnis secim yaptiniz. Tekrar deneyiniz");
                   break;

       }

    }

    private static void getInfo(Map<Integer, Bilgi> kisiBilgisi) {
        System.out.println("***********Kimlik No ile Kisi***************");
        System.out.println("Sorgulamak istediginiz kisinin kimlik No sini giriniz: ");
        int kimlikNum=scan.nextInt();

        if (kisiBilgisi.isEmpty()){
            System.out.println("Bu liste bostur");
       }else if (kisiBilgisi.get(kimlikNum)==null){
            System.out.println("Bu kimlik no kayitli degildir");
        }else {
            System.out.println(kisiBilgisi.get(kimlikNum));
        }

        selectOption();

    }

    private static void removeInfo(Map<Integer, Bilgi> kisiBilgisi) {
        System.out.println("*********** Kimlik No ile Kisi Silin ***************");
        System.out.println("Silmek istediginiz kisinin kimlik No sini giriniz: ");
        int kimlikNum=scan.nextInt();

        if (kisiBilgisi.isEmpty()){
            System.out.println("Bu liste bostur");
        }else if (kisiBilgisi.get(kimlikNum)==null){
            System.out.println("Bu kimlik No yoktur");
        }else {
            kisiBilgisi.remove(kimlikNum);
            System.out.println(kimlikNum+"kimlik no bilgiler silinmistir");
        }
        System.out.println("Listeyi gormek isterseniz 'E', degilse herhangi bir tusa basiniz");
        String secim=scan.next();
        if (secim.equalsIgnoreCase("E")) {
            System.out.println(kisiBilgisi.toString());
            selectOption();
        }else{
            selectOption();
        }




    }

    private static void bilgiEkle(Map<Integer, Bilgi> kisiBilgisi) {
        System.out.println("**********KISI BILGILERI************");
        System.out.println("Lutfen Kimlik No giriniz(or:1001): ");
        int kimlikNum=scan.nextInt();
        System.out.println("Lutfen Tam Adinizi Soyadinizi giriniz: ");
        scan.nextLine();
        String tamIsmi=scan.nextLine();
        System.out.println("Lutfen Adresinizi giriniz: ");
        String adres=scan.nextLine();
        System.out.println("Lutfen Telefon No giriniz: ");
        int telefonNum=scan.nextInt();

      Bilgi bilgiler=new Bilgi(kimlikNum, tamIsmi, adres, telefonNum);
        kisiBilgisi.put(kimlikNum,bilgiler);
        System.out.println(bilgiler.toString());
        selectOption();

    }
}
