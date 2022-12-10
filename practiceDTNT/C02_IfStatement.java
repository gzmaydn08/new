package pratice.practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
        kullanıcıdan alacağınız iki sayıyı yine kullanıcıya seçtireceğiniz dört işlemden biri ile iişleme koyup yazdırınız.


         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen\n toplama yapmak için  1\n çıkarma yapmak için 2\n çarpma yapmak için  3 \n bölme yapmak için 4 giriniz.....");
        int islem = input.nextInt();
        System.out.println("lütfen 2 tamsayı giriniz...");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (islem ==1){
            System.out.println("toplama işleminin sonucu :"+ num1+"+"+num2 + "="+ (num1+num2));
        } else if (islem == 2) {
            System.out.println("çıkarma işleminin sonucu :"+ num1+"-"+num2 + "="+ (num1-num2));

        } else if (islem == 3) {
            System.out.println("çarpma işleminin sonucu :"+ num1+"*"+num2 + "="+ (num1*num2));

        } else if (islem == 4) {
            System.out.println("bölme işleminin sonucu :"+ num1+"/"+num2 + "="+ (num1/num2));

        }else {
            System.out.println("tanımlanmamış işlem ");
        }


    }
}
