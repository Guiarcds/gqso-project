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

    private void setSaldo(double value) {
        this.saldo = value;
    }

    public double saque(double value) throws SaldoInsuficiente, InputValorNegativo {
        if (value > saldo()) {
            throw new SaldoInsuficiente();
        } else if (value < 0) {
            throw new InputValorNegativo();
        }
        setSaldo(saldo() - value);
        return saldo();
    }

    public double deposito(double value) {
        setSaldo(saldo() + value);
        return saldo();
    }

}