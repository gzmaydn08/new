package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        example 1)
        verilen yılın artık yıl[(leap year)interwiew sorusu] olup olmadığınız kontrol eden kodu yazınız.
        yıl 100 e bölünüyosa 400 e de bölünmelirdir ==> 1600==> leop year   1800==> leap değildir.
        yıl 100 e bölünmüyosa 4 e bölünmelidir.==> 2004 ==> leop    2005==> leap değil

         */

        int year = 1800;

       String result =  year%100==0 ? (year%400 ==0 ? "leap": "not leap") :(year%4 ==0 ? "leap" : "not leap");
        System.out.println(result);




    }
}
