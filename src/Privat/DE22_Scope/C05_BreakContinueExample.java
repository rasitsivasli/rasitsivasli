package Privat.DE22_Scope;

public class C05_BreakContinueExample {
    public static void main(String[] args) {
//        Example ooo = new Example();
//        ooo.
        example2();
    }
    private static void example1(){
        int a=5;
        for (int i = 0; i <10 ; i++) {
            a++;
            if (i==5) continue; // go to 10; içinde bulundu döngünün 1 sonraki adımına geçer
            System.out.println(i);
            if (i==7) break; // go to 11: içinde bulunduğu döngüden çıkar
            // 10 :
        }
        // 11:
    }
    private static void example2(){
        int a=5;
        // bu örnekte, continue ve break hiç bir durumda dıştaki for u ilgilendirmiyor
        for (int j = 0; j <5 ; j++) {
            for (int i = 0; i <10 ; i++) {
                a++;
                if (i==5) continue; // go to 10; içinde bulundu döngünün 1 sonraki adımına geçer, alttakileri o tur için es gecer
                System.out.print(i+" ");
                if (i==7) break; // go to 11: içinde bulunduğu döngüden çıkar
                // 10 :
            }

            System.out.println("\nbirinci for bitti");
        }

    }
}
