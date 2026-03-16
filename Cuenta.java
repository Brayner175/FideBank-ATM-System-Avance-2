public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(String numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public boolean transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
