package work1;

public class C29 {
    public static void main(String[] args) {
     //   29----
     //   Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
     //   Test Data:
     //   sentence -> "Java is fun"
     //   reversed -> "fun is Java"

        String str="Java is fun";
        String ters="";
        for (int i = str.length()-1; i>=0 ; i--) {
           ters+= str.substring(i,i+1);
        }
        System.out.print(ters);
    }

}
