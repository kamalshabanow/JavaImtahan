package task3;

public class Avtomobil {
    private String model;
    private String ad;
    private double qiymet;
    private String avtomobilSahibi;

    public Avtomobil(String model, String ad, double qiymet, String avtomobilSahibi) {
        this.model = model;
        this.ad = ad;
        this.qiymet = qiymet;
        this.avtomobilSahibi = avtomobilSahibi;
    }
    public Avtomobil(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getQiymet() {
        return qiymet;
    }

    public void setQiymet(double qiymet) {
        this.qiymet = qiymet;
    }

    public String getAvtomobilSahibi() {
        return avtomobilSahibi;
    }

    public void setAvtomobilSahibi(String avtomobilSahibi) {
        this.avtomobilSahibi = avtomobilSahibi;
    }

    public static void main(String[] args) {
        Avtomobil avtomobil = new Avtomobil();
        avtomobil.setAd("BMW");
        avtomobil.setModel("M3");
        avtomobil.setQiymet(50000);
        avtomobil.setAvtomobilSahibi("John");

        System.out.println(avtomobil.getAd());
        System.out.println(avtomobil.getModel());
        System.out.println(avtomobil.getQiymet());
        System.out.println(avtomobil.getAvtomobilSahibi());

    }
}
