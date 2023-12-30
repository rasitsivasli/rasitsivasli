package Privat.DE22_Scope.Test;

public class Hayvan extends Canli{
    String omru;


    public Hayvan(String tur, String yas) {
        super(tur, yas);
    }

    public Hayvan(String tur, String yas, String omru) {
        super(tur, yas);
        this.omru = omru;
    }
}
