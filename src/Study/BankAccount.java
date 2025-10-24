package Study;

public class BankAccount {
    private String numberAccount;
    protected double balance;
    public String name;

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositar(double amount){
        this.balance += amount;
    }

    public void sacar(double amount){
        if (this.balance < amount){
            System.out.println("saldo insuficiente");
        } else {
            this.balance -= amount;
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: $ "+ balance);
    }
}
