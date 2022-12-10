package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {


        //example 1

        int a= 10;
        int b = 20;

        int r1 = a<b ? a++ : ++b;

        System.out.println(r1);//10

        System.out.println(a);//11

        System.out.println(b);//20


        //example 2 verilen bir sayının mutlak değerini hesaplayan kodu yazınız

        int c = -4;

        int r2 = c<0 ? -1*c :c;

        System.out.println(r2);//4


        //example3 iki sayının işareti aynı ise bu sayıları çarpan işaretleri farklı ise
        // farklı işaretleri çarpamıyorum mesajı veren kodu yazınız.

        int m = 5;
        int n = -6;

        Object r3 = ( m>0 && n>0) || (m<0 && n<0) ? m*n : "farklı işaretli sayıları çarpamıyotum";// farklı data tipleri olursa "Object" yapılır.
        System.out.println(r3);



    }
}
