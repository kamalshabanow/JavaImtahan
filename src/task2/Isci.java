package task2;

public class Isci {
    public String ad;
    public String soyad;
    public int tevellud;
    public String islediyiSobe;
    public String vezife;
    public double resmiMaas;

    public int dersYuku;
    public String elmiAdi;
    public int laborantinIsSaati;

    public double muhasibMaasi;


    public static void main(String[] args) {
        Isci muellim = new Isci();
        muellim.dersYuku = 20;
        muellim.elmiAdi = "Dosent";
        Isci laborant = new Isci();
        laborant.laborantinIsSaati = 15;
        Isci muhasib = new Isci();
        muhasib.muhasibMaasi = 1400;
    }

    public static void isciMaasi(){
        Isci muellim = new Isci();
        Isci laborant = new Isci();
        Isci muhasib = new Isci();

        muellim.resmiMaas = 1100;
        laborant.resmiMaas = 750;
        muhasib.resmiMaas = 1400;
    }


}
