package work1;

import java.util.*;

public class C20 {
    public static void main(String[] args) {

        //  20----
        //  Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
        //  not: Test datadaki değerleri kullanınız.
        //  Test Data:
        //  [1232, 1134,2345,1022]
        //  [Java, Python, PHP, C#, C Programming, C++]
        //      Beklenen Çıktı:
        //  [1022,1134,1232,2345]
        //  [C Programming, C#, C++, Java, PHP, Python]

        List<Integer> sayi = new ArrayList(Arrays.asList(1232, 1134, 2345, 1022));
        Collections.sort(sayi);

        List<String>  str = new ArrayList(Arrays.asList("Java, Python, PHP, C#, C Programming, C++"));

        Collections.sort(str);

        System.out.println(sayi);
        System.out.println(str);

    }
}
