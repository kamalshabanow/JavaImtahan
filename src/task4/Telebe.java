package task4;

import java.util.ArrayList;
import java.util.List;

public class Telebe {

    private int id;
    private String ad;
    private String soyad;
    private double ortalama;
    static Telebe telebe = new Telebe();

    public Telebe(int id, String ad, String soyad, double ortalama) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.ortalama = ortalama;
    }

    public Telebe(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public static List<Telebe> getTelebeList() {
        return telebeList;
    }

    public static void setTelebeList(List<Telebe> telebeList) {
        Telebe.telebeList = telebeList;
    }

    public static void main(String[] args) {

    }

     static List<Telebe> telebeList = new ArrayList<>();

    public static void telebeElaveEt(int id){
        telebeList.add(id,new Telebe(1,"Kamal","Shabanov",85));
    }

    public static void telebeSil(int id){
        telebeList.remove(id);
    }

    public static void axtarisEt(int id){
        if(telebe.id == id){
            System.out.println("Axtardiginiz id-ye aid telebe tapildi");
        }else{
            System.out.println("Telebe tapilmadi");
        }
    }

}
