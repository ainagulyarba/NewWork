package work1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C27 {
    public static void main(String[] args) {

     //   27----
     //   Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
     //   Array: [1232,2345,5467,678,3454,2312,3451]



       List<Integer> arr= new ArrayList(Arrays.asList(1232,2345,5467,678,3454,2312,3451));
        Collections.sort(arr);
        System.out.println(arr);
       int sayi=0;
        for (int i = 0; i < arr.size(); i++) {
            sayi= arr.get(arr.size() - 2);
        }
        System.out.println(sayi);

    }
}
