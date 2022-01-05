package work1;

public class C28 {

    public static void main(String[] args) {
     //   28----
     //   Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
     //   Array: [1,2,3,4,5,6,7,8,9]
     //   Beklenen Çıktı:
     //   Tek Sayilar: 5
     //   Cift Sayilar: 4

        int[] arr ={1,2,3,4,5,6,7,8,9,};
        int sayacTek=0;
        int sayacCift=0;
        for (int i = 1; i <=arr.length; i++) {
            if (i%2==1){
                sayacTek++;
            }

            }

        for (int j = 1; j <=arr.length ; j++) {
            if (j%2==0){
                sayacCift++;
            }
        }

        System.out.println("Tek sayilar: "+sayacTek+"\nCift sayilar: "+sayacCift);



    }
}
