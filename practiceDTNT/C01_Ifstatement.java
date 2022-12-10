package pratice.practiceDTNT;

import java.util.Scanner;

public class C01_Ifstatement {

    public static void main(String[] args) {

      /*
      kullanıcıdan bir gün alın
      eğer gün cuma ise müslümanlar için kutsal gün
      eğer gün cumartesi ise yahudiler için kutsal gün
      eğer gün pazar ise hristiyanlar kutsal gün yazdıran kodu oluşturunuz.

       */


        Scanner input = new Scanner(System.in);
        System.out.println(" lütfen bir gün ismi giriniz.");

        String gun = input.next().toLowerCase();//küçük harfe çevirdik.

        if (gun.equals("cuma")){
            System.out.println("müslümanlar için kutsal gün...");

        } else if (gun.equals("cumartesi")) {
            System.out.println("yahudiler için kutsal gün...");

        } else if (gun.equals("pazar")) {
            System.out.println("hristiyanlar kutsal gün ...");

        }else {
            System.out.println("tanımlanmamış gün...");
        }


    }
}
