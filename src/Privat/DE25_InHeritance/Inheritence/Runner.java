package Privat.DE25_InHeritance.Inheritence;

class Runner {
    public static void main(String[] args) {
        //  Animal hayvan = new Animal(30,"hayvan");
        Kanatlilar knt = new Kanatlilar(10, "cins");
        System.out.println("----");
      //  knt.ses(5);
        System.out.println("----");
        knt.ses();
        System.out.println("----");
        Canli cc = new Kanatlilar(20,"cinsdir");
        System.out.println("------------canlı cc den sonrası");
        cc.ses();

    }
}
