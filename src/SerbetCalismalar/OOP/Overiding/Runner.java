package SerbetCalismalar.OOP.Overiding;

public class Runner {
    public static void main(String[] args) {

        AvciKuslar avciKuslar = new AvciKuslar();
        avciKuslar.beslenme();
        avciKuslar.hareket();

        KumesKuslari kumesKuslari = new KumesKuslari();
        kumesKuslari.hareket();
        kumesKuslari.ureme();
        System.out.println("kumesKuslari.gorurMu = " + kumesKuslari.gorurMu);
        System.out.println("kumesKuslari.kanadiVarMi = " + kumesKuslari.kanadiVarMi);

        Hayvanlar kumesKusu = new KumesKuslari();
        kumesKusu.beslenme();
        kumesKusu.hareket();


        Kuslar kumesKusu2 = new KumesKuslari();
        kumesKusu2.ureme();
        kumesKusu2.hareket();
        kumesKusu2.solunum();


    }
}
