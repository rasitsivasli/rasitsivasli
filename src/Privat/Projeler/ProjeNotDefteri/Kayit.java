package Privat.Projeler.ProjeNotDefteri;

public class Kayit {
    private int no;
    private String not;

    public Kayit(int no, String not) {
        this.no = no;
        this.not = not;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    @Override
    public String toString() {
        return "no=" + no +
                ", not='" + not + '\'' +
                '}';
    }
}
