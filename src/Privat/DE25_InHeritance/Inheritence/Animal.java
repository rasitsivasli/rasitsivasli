package Privat.DE25_InHeritance.Inheritence;

class Animal extends Canli {
    private int aSayisi;
    private String cinsiyet;


    public Animal(int omur, String cins) {
        super(omur, cins); // süper class daki yani parent class
        // yani Canli  daki bu paremtrelere sahip constructor call adiliyor
        System.out.println("animal");
    }

    public Animal(int omur, String cins, int aSayisi, String cinsiyet) {
        super(omur, cins);
        this.aSayisi = aSayisi;
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {

        return "Animal{" +
                "aSayisi=" + aSayisi +
                ", cinsiyet='" + cinsiyet + '\'' +
                " cins =" + getCins() +
                " omur =" + getOmur() +
                // ustteki 2 satır veya altatki
                super.toString() +
                '}';
    }


    void ses() {

        System.out.println("animal ses");
    }

    @Override
    void ses(int ss) {
        super.ses(ss);
        System.out.println("animal ses");
    }

}
