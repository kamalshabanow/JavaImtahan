package task9;

public class Main {
    public static void main(String[] args) {
        Menecer menecer = new Menecer();
        menecer.calculateSalary();
        menecer.displayInfo();
        Menecer.elaveMaas = 300;

        Proqramci proqramci = new Proqramci();
        proqramci.calculateSalary();
        proqramci.displayInfo();
        Proqramci.elaveIsSaati = 3;
        Proqramci.saatliqMaas = 40;

    }
}
