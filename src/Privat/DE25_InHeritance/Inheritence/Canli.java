package Privat.DE25_InHeritance.Inheritence;

class Canli {
    private int omur;
    private String cins;



    public Canli(int omur, String cins) {
        this.omur = omur;
        this.cins = cins;
        System.out.println("canli");
    }

    @Override
    public String toString() {
        return "Canli{" +
                "omur=" + omur +
                ", cins='" + cins + '\'' +
                '}';
    }

    public int getOmur() {
        return omur;
    }

    public void setOmur(int omur) {
        this.omur = omur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    void ses() {
        System.out.println("canı ses");
    }
    void ses(int vv) {
        System.out.println("canı ses vv");
    }

    public Canli() {
    }
}
