package CodeChallenges.Projeler.KahveProjesi.KahveProjesiAsyaHanim;

import static CodeChallenges.Projeler.KahveProjesi.KahveProjesiAsyaHanim.Kahve.BOLD;

public class Runner {
    public static void main(String[] args) {
        System.out.println(BOLD + "Java Kahve'ye Hoşgeldiniz:");
        //  Scanner scanner=new Scanner(System.in);

        Kahve kahve1=new Kahve();

        kahve1.kahveSec();
        System.out.println(kahve1);
        kahve1.sutSec();
        System.out.println(kahve1);
        kahve1.sekerSec();
        System.out.println(kahve1);
        kahve1.boySec();
        System.out.println(kahve1);
        System.out.println(kahve1.boy+" "+kahve1.sut+" "+kahve1.seker+" "+kahve1.name+" hazırdır.Afiyet olsun:)");
        kahve1.UcretHesapla();

}}
