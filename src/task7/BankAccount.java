package task7;

public class BankAccount {

    private double hesabBalansi;

    public void deposit(){

    }

    public void withdraw(){
        if(hesabBalansi < 100){
            System.out.println("Hesab balansi 100den asagidir.SavingAccount classina kecid edin");
        }
    }
}
