package Study;

public class CurrentAccount extends BankAccount{
    private double tarifaMensal;

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        balance -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + balance);
    }

}
