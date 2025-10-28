package Study.model;

public class CurrentAccount extends BankAccount{
    private double tarifaMensal;

    public CurrentAccount(String name, int numberAccount, double balance) {
        super(name, numberAccount, balance);
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        balance -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + balance);
    }

}
