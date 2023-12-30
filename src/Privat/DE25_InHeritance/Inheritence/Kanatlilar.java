package Privat.DE25_InHeritance.Inheritence;

public class Kanatlilar extends Animal {
    private int kanatUzunlugu;


    public Kanatlilar(int omur, String cins) {
        super(omur, cins); // süper class daki yani parent class
        // yani Animal  daki bu paremtrelere sahip constructor call adiliyor

        System.out.println("kanatlilar");
    }

    public Kanatlilar(int omur, String cins, int aSayisi, String cinsiyet) {
        super(omur, cins, aSayisi, cinsiyet);
    }

    public Kanatlilar(int omur, String cins, int kanatUzunlugu) {
        super(omur, cins);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public Kanatlilar(int omur, String cins, int aSayisi, String cinsiyet, int kanatUzunlugu) {
        super(omur, cins, aSayisi, cinsiyet);
        this.kanatUzunlugu = kanatUzunlugu;
    }


    void ses() {
        super.ses(); // animal dakini çağırıır
        System.out.println("kanatlılar ses");
    }

    @Override
    void ses(int vv) {
        super.ses(vv); // canlıdakini çağırır çünkü animal da yok
        System.out.println("kanatlılar vv");
    }
}
