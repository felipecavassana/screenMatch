package Study;

public class BankAccount {
    public String name;
    private int numberAccount;
    protected double balance;

    public BankAccount(String name, int numberAccount, double balance) {
        this.name = name;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public int getNumberAccount() {
        return numberAccount;
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
