import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_practice {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(-5,-8,2,-12,0,1,12,5,6,9,15,8));

        // S1:listi aralarinda bosluk birakarak yazdiriniz
        System.out.println(myList+ " ");

        //S2: sadece negatif olanlari yazdir

        for (int i = 0; i < myList.size(); i++) {
           if(myList.get(i)<0){
               System.out.print(myList.get(i)+" ");
           }
        }
        System.out.println();
        //S3: pozitif olanlardan yeni bir liste olustur
       List<Integer> yeni1=new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i)>=0){
                yeni1[i]+=myList.get(i);
            }
            System.out.print(yeni1.get(i)+" ");
        }
        // S4: list in elemanlarin karelerinden yeni bir list olusturalim
        //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        //S6: listin elemanlarini kucukten buyuge siralayalim
        //S7: listin elemanlarini buyukten kucuge siralayalim
        // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        //S9: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        // S10 :list elemanlarini toplamini bulalim
        // S11 : peek ornegi cozelim negatiplerin karelerinden list olusturalim
        // S12 : listeden 5 den buyuk  sayi var mi
        // S13 : listin tum elemanlari sifirdan kucukmu
        // S14: listin 100 e esit elemani yok
        // S15: listin sifira esit elemani yok
        // S16 : limit listenin ilk 5 elemanini topla
        //S17: skip dizinin son bes elemaninin  listele







    }

}
