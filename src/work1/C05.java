package work1;

public class C05 {
    public static void main(String[] args) {
  //     5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
  //             Test Data:
  //     Yarım elmas uzunluğu : 7
  //     Beklenen Çıktı:
  //       *
  //      ***
  //     *****
  //    *******
  //   *********
  //  ***********
  // *************
  //  ***********
  //   *********
  //    *******
  //     *****
  //      ***
  //       *

        for (int i = 1; i <=7; i++) {

            for (int j = 1; j <=7-i; j++)
                System.out.print(" ");

            for (int j2 = 1; j2 <=2*i-1; j2++)
                System.out.print("*");

            System.out.println();

        }
        for (int i=7-1; i>=1 ; i--) {

            for (int j = 1; j <=7-i; j++)
                System.out.print(" ");

            for (int j2 = 1; j2 <=2*i-1; j2++)
                System.out.print("*");

            System.out.println();

        }


    }
}
