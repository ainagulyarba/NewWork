package work1;

public class C22 {
    public static void main(String[] args) {

        //  22----
        //  Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        //  Array =  [20, 30, 25, 35, -16, 60, -100 ]
        //  Beklenen Çıktı:
        //  Array Sayılarının ortalaması: 7.0


        int arr[]={20, 30, 25, 35, -16, 60, -100};
        int sayac = 0;
        int ortalama = 1;
        for (int i = 0; i <arr.length; i++) {
            sayac+=arr[i];

        }
        System.out.println(sayac);

        ortalama = sayac / arr.length;
        System.out.println(ortalama);

    }
}
