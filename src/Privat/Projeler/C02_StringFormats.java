package Privat.Projeler;

public class C02_StringFormats {
    public static void main(String[] args) {
        String str="merhaba";
        String str1 = String.format(".%10s.",str);
        String str2 = String.format(".%-10s.",str);
        String str3 = String.format(".%-10S.",str);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        int sayi = 46523410;
        String str4 = String.format(".%2d.",sayi);
        String str5 = String.format(".%16d.",sayi);
        String str6 = String.format(".%-16d.",sayi);
        System.out.println("sayi = " + str4);
        System.out.println("sayi = " + str5);
        System.out.println("sayi = " + str6);
        double dd = 3.456784;
        String str7 = String.format(".%f.",dd);
        String str8 = String.format(".%10.2f.",dd);
        String str9 = String.format(".%12.10f.",dd);
        String str10= String.format(".%-10.1f.",dd);

        System.out.println("dd   = " + str7);
        System.out.println("dd   = " + str8);
        System.out.println("dd   = " + str9);
        System.out.println("dd   = " + str10);
        String str11= String.format("%-10s%10d,%10.4f.",str,sayi,dd);
        System.out.println("str11 = " + str11);
        System.out.printf("str11 = %-10s%10d,%10.4f.",str,sayi,dd);
        System.out.printf("\nstr  =%10s\nsayi =%10d\ndd   =%10.4f",str,sayi,dd);
        /*
        % ile harf arasına ilgili variable için ayrılacak yer girilir örnek %5d gibi
        eğer variableın uzunluğu 5 yada daha fazla ise, kesmeden tam yazar, 5 den az ise 5 lik yer ayrır
        variable ı sağa dayalı yazar (bosluklar solda kalır)
        eğer % den hemen sonra - var ise (%-10d) gibi 10 luk yer ayır ve sola dayalı yaz demektir
         */

    }
}
