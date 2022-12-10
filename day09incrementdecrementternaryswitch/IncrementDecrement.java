package day09incrementdecrementternaryswitch;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a =5;

        System.out.println(a);//5

        //increment

        a = a+2;
        System.out.println(a);//7

        a += 2; //increment
        System.out.println(a);//9

        //example 1) bir tane integer oluşturun iki şekilde 5 arttırın

        int b = 4;
        System.out.println(b);//4

        b= b+5;
        System.out.println(b);//9

        b += 5;
        System.out.println(b);//14

        //decrement

        int c = 8;
        System.out.println(c);//8

        c = c-3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2


        //increment2

        int d = 6;
        System.out.println(d);//6

        d = d*2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//24

        //decrement2

        int e = 24;
        System.out.println(e);//24

        e = e/2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        // 1 ile icrement ve decrement
        int f =12;
        f++;

        int h = 10;
        h--;


        //post increment ve pre increment

        int i =10;
        int k = i++;//post
        System.out.println(k);//10 ==> i arttırılmadan k ya konduğu için k nın değeri 10 olur

        System.out.println(i);//11 ==> i satır sonunda arttırıldığı için  i nın değeri 11 olur

        int m = 15;
        int n = ++m;//pre

        System.out.println(m);//16 ==> m satır sonunda arttırıldığı için m 16 olur

        System.out.println(n);//16 ==> m arttırıldıktan sonra n ye konulduğu için n 16 olur


        //post decrement ve pre decrement

        int p = 19;
        int r = p--;

        System.out.println(r);//19
        System.out.println(p);//18


        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19


    }


}
