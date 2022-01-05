package proje1;

public class Bilgi {

    private int kimlikNum;
    private String tamIsmi;
    private String adres;
    private int telefonNum;

    @Override
    public String toString() {
        return "Bilgi{" +
                "kimlikNum=" + kimlikNum +
                ", tamIsmi='" + tamIsmi + '\'' +
                ", adres='" + adres + '\'' +
                ", telefonNum=" + telefonNum +
                '}';
    }

    public Bilgi(int kimlikNum, String tamIsmi, String adres, int telefonNum) {
        this.kimlikNum = kimlikNum;
        this.tamIsmi = tamIsmi;
        this.adres = adres;
        this.telefonNum = telefonNum;
    }

    public int getKimlikNum() {
        return kimlikNum;
    }

    public void setKimlikNum(int kimlikNum) {
        this.kimlikNum = kimlikNum;
    }

    public String getTamIsmi() {
        return tamIsmi;
    }

    public void setTamIsmi(String tamIsmi) {
        this.tamIsmi = tamIsmi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefonNum() {
        return telefonNum;
    }

    public void setTelefonNum(int telefonNum) {
        this.telefonNum = telefonNum;
    }
}
