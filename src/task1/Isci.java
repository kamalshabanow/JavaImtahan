package task1;

import java.util.Scanner;

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
//        Isci muellim = new Isci();
//        muellim.dersYuku = 20;
//        muellim.elmiAdi = "Dosent";
//        Isci laborant = new Isci();
//        laborant.laborantinIsSaati = 15;
//        Isci muhasib = new Isci();
//        muhasib.muhasibMaasi = 1400;
//
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Massivin ededleri: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void isciAdiSoyadiVezifesi() {
        Isci muellim = new Isci();
        Isci laborant = new Isci();
        Isci muhasib = new Isci();

        muellim.ad = "Jale";
        muellim.soyad = "Agazade";
        muellim.vezife = "Muellim";

        laborant.ad = "Xuraman";
        laborant.soyad = "Eliyeva";
        laborant.vezife = "Bas laborant";

        muhasib.ad = "Anar";
        muhasib.soyad = "Babayev";
        muhasib.vezife = "Bas muhasib";
    }


}
