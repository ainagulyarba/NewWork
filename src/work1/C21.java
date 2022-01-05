package work1;

public class C21 {
    public static void main(String[] args) {

     // 21----
     // Array deki sayıları tolpayan Java kodunu yazınız.
     // array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     // Beklenen Çıktı:
     // Array toplamı: 55

       int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int sayac=0;
        for (int i = 0; i <arr.length; i++) {
            sayac+=arr[i];
        }

        System.out.println(sayac);

    }
}
