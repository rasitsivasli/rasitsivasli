package Privat.DE31_Maps.KonuAnlatim;

public class Adres {
    private String mahalle;
    private String cadde;
    private int id; // key olarak kullanıyoruz

    public Adres() {
    }

    public Adres(String mahalle, String cadde, int id) {
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.id = id;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "mahalle='" + mahalle + '\'' +
                ", cadde='" + cadde + '\'' +
                ", no=" + id +
                '}';
    }
}
