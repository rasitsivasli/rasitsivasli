package SerbetCalismalar.Map.EbobEkok;

public class EbobEkok {
// TASK
//  2 say?n?n Obeb ve Okek de?erlerini bulan bir App yaz?n?z.
// --> YÖNTEM <--
// ObebOkek CLASS (pojo class)
// 2 int de?er tan?mlayal?m
// Encapsulation uygulayal?m
// HESAP CLASS (Metotlar?m?z için olu?turdu?umuz class)
// 2 Method yazal?m
// 1) obeb --> Parametre olarak ObebOkek class?ndan bir obje als?n
// 2) okek --> Parametre olarak ObebOkek class?ndan bir obje als?n
// RUNNER CLASS (??lem class?m?z )
// Bir obje üretip bu objen?n OBEB ve OKEK degerlerini hesaplay?p yazd?ral?m

    private int a ;
    private int b ;

    public EbobEkok(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public EbobEkok() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "EbobEkok{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
