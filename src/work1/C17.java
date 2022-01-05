package work1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C17 {
    public static void main(String[] args) {
      //  17---
      //  Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
      //  Test data:
      //  12,24,34
      //  Beklenen Çıktı:
      //  12

        List<Integer> sayi = new ArrayList(Arrays.asList(12,24,34));

        Optional<Integer> a = sayi.stream().reduce(Integer::min);

        System.out.println(a);

    }
}
