package Privat.Projeler.ProjeAdresSunum.KendiYaptigim;

public class Kisiler {
    private int ID ;
    private String ad;
    private String soyad;
    private String tel;
    private String adres;
    private String eMail;
    private boolean statu= true;

    public Kisiler() {
    }

    public Kisiler(int ID, String ad, String soyad, String tel, String adres, String eMail, boolean statu) {
        this.ID = ID;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.eMail = eMail;
        this.statu = statu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isStatu() {
        return statu;
    }

    public void setStatu(boolean statu) {
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "{" +"Id =  "+getID()+","+
                " ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tel=" + tel +
                ", adres='" + adres + '\'' +
                ", eMail='" + eMail + '\'' +
                ", statu=" + statu +
                '}';
    }
}
