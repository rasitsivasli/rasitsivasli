package Privat.Projeler.ProjeAsyaHanimYonetimPlatformu;

public class Ogrenci {
    private String adSoyAd;
    private String kimlikNo;
    private int yas;
    private String ogrenciNo;
    private String ogrenciSinif;

    public Ogrenci(String adSoyAd, String kimlikNo, int yas, String ogrenciNo, String ogrenciSinif) {
        this.adSoyAd = adSoyAd;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciSinif = ogrenciSinif;
    }

    public Ogrenci() {
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

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(String ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }

    @Override
    public String toString() {
        return "adSoyAd='" + adSoyAd + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", ogrenciSinif='" + ogrenciSinif + '\'' +
                '}';
    }
}
