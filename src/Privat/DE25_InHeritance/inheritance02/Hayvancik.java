package Privat.DE25_InHeritance.inheritance02;

public class Hayvancik {// G parent-super (dede)  Class
    int a;//inst. default int type variable
    int m=3;//inst. initial  int type variable
    public Hayvancik() {//p'siz cons.
        System.out.println("Agam ahan da HAYVANCIK p'siz cons...");
    }
    public Hayvancik(int x) {//int p'li cons.
        System.out.println("Agam ahan da HAYVANCIK p'li cons...");
    }
    public void mA(){
        System.out.println("mA -> HAYVANCIK  class meth. call...");
    }
    public void mM(){//Child'da ezilen meth
        System.out.println("mM -> HAYVANCIK  class meth. call...");
    }
}//Class sonu
