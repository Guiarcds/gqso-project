package bank;

public class Bank {
    private double saldo;

    public double saldo() {
        return this.saldo;
    }

    public void setSaldo(double value) {
        this.saldo = value;
    }

    public double saque(double value){
        setSaldo(saldo() - value);
        return saldo();
    }
}