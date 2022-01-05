package work1;

import java.util.Arrays;


public class C33 {
    public static void main(String[] args) {

        //  33-----
        //          Bir arrayi tersine çeviren  method yazınız.
        //  Test Data:
        //  reverse [1, 2, 3, 4]
        //  return  [4, 3, 2, 1]

        int arr[] = {1, 2, 3, 4};

        System.out.println(Arrays.toString(tersYaz(arr)));

    }

    private static int [] tersYaz(int arr[]) {

        int tersArray []=new int[arr.length];

        for (int i = 0; i < tersArray.length; i++) {

            tersArray[i]=arr[arr.length-1-i];

        }

        return tersArray;


    }
}