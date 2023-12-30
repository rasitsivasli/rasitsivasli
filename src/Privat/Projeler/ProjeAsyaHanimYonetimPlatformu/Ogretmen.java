package Privat.Projeler.ProjeAsyaHanimYonetimPlatformu;

public class Ogretmen {
    private String adSoyAd;
    private String kimlikNo;
    private int yas ;
    private String bolum;
    private String sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String adSoyAd, String kimlikNo, int yas, String bolum, String sicilNo) {
        this.adSoyAd = adSoyAd;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getAdSoyAd() {
        return adSoyAd;
    }

    public void setAdSoyAd(String adSoyAd) {
        this.adSoyAd = adSoyAd;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "adSoyAd='" + adSoyAd + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
    }
}
