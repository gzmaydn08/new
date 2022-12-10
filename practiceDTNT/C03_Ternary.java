package pratice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*

        kullanıcıdan sıfırdan büyük bir tam sayı girmesini isteyin
        girilen tam sayı 3 basamaklı ise ekrana 3 basamaklı yazdırın
        üç basamaklı değilse çift olup olmadığını kontrol edin
        çift ise 3 basamaklı olmayan çift sayı yazdırın
        çift sayı değilse 3 basamaklı olmayan tek sayı yazdırın

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sıfırdan büyük bir tam sayı giriniz..");
        int sayi = input.nextInt();

        System.out.println("**************** if çözümü*************");

        boolean sifirdanBuyukUcBas =sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayan = !(sayi>99 && sayi < 1000) && sayi%2==0;

            if (sayi>0) {

                if (sifirdanBuyukUcBas){
                System.out.println("3 basamaklı sayı");

            } else if (sifirdanBuyukUcBasOlmayan) {
                System.out.println("3 basamaklı olmayan pozitif çift sayı");

            }else
                System.out.println("üç basamaklı olmayan pozitif tek sayı");


        }else {
            System.out.println("lütfen pozitif bir tam sayı giriniz...");
        }


        System.out.println("*********** ternary çözümü***********");


        boolean sifirdanBuyukUcBasTer =sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanTer = !(sayi>99 && sayi < 1000) && sayi%2==0;

        //şart ? true   :   false

        String sonuc = sayi>0 ?  sifirdanBuyukUcBasTer ? ("üç basamaklı sayı"): sifirdanBuyukUcBasOlmayanTer ? ("üç basamaklı olmayn çift sayı")
                :("üç basamaklı olmayan tek sayı"): ("lütfen pozitif bir tam sayı giriniz");
        System.out.println(sonuc);
    }
}
