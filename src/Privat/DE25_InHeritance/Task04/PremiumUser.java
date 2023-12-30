package Privat.DE25_InHeritance.Task04;

public class PremiumUser extends SuperUser{
    private int height;
    private String okul;
    private String name;

    public PremiumUser() {

    }



    public PremiumUser(int height, String okul) {
        this.height = height;
        this.okul = okul;
    }

    public PremiumUser(String name, int age, String name1) {
        super(name, age);
        this.name = name1;
    }


    @Override
    public void setName(String name) {
        super.setName(name);
        this.name=name;

    }
    public PremiumUser(String name, int age, int height, String okul, String name1) {
        super(name, age);
        this.height = height;
        this.okul = okul;
        this.name = name1;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    @Override
    public String toString() {
        return "PremiumUser{" +super.toString()+
                "height=" + height +
                ", okul='" + okul + '\'' +
                '}';
    }
}
