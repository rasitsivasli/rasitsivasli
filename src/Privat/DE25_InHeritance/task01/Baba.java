package Privat.DE25_InHeritance.task01;

import java.util.ArrayList;
import java.util.List;

public class Baba {
    static String vatandas= "tc";
    String isim;
    String soyisim="sivasli";
    int yas;
    private String tc="123456";
    List<Cocuk> list = new ArrayList<>();

    public Baba() {
        System.out.println("Baba cons. calisti");
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public Baba(String isim) {
        System.out.println("Baba parametreli cons. calisti");
    }
    public void yuzme(){
        System.out.println("Cok iyi futbol oynar");
    }
    public String getTc() {
        tc = tc.substring(0,3)+"*******";
        return tc;
    }
    public String tcDegistir(String tc){// set metodu yazdik
        this.tc=tc;
        return tc;
    }

    @Override
    public String toString() {
        return "Baba{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", tc='" + tc + '\'' +
                '}';
    }
}
