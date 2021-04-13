package bank;

public class Bank {
    private double saldo;

    public class SaldoInsuficiente extends Exception {
        private static final long serialVersionUID = 1L;
    }

    public class InputValorNegativo extends Exception {
        private static final long serialVersionUID = 1L;
    }

    public double saldo() {
        return this.saldo;
    }

    public void setSaldo(double value) {
        this.saldo = value;
    }

    public double saque(double value) {
        setSaldo(saldo() - value);
        return saldo();
    }

    public double deposito(double value) {
        setSaldo(saldo() + value);
        return saldo();
    }

}