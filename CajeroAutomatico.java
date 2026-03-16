public class CajeroAutomatico {

    public void retirar(Cuenta cuenta, double monto) {
        if (cuenta.retirar(monto)) {

            Transaccion t = new Transaccion(
                    "Retiro",
                    monto,
                    cuenta.getCliente().getNombre(),
                    cuenta.getNumeroCuenta(),
                    cuenta.consultarSaldo()
            );

            t.imprimirComprobante();

        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void depositar(Cuenta cuenta, double monto) {

        cuenta.depositar(monto);

        Transaccion t = new Transaccion(
                "Deposito",
                monto,
                cuenta.getCliente().getNombre(),
                cuenta.getNumeroCuenta(),
                cuenta.consultarSaldo()
        );

        t.imprimirComprobante();
    }

    public void transferir(Cuenta origen, Cuenta destino, double monto) {

        if (origen.transferir(destino, monto)) {

            Transaccion t = new Transaccion(
                    "Transferencia",
                    monto,
                    origen.getCliente().getNombre(),
                    origen.getNumeroCuenta(),
                    origen.consultarSaldo()
            );

            t.imprimirComprobante();

        } else {
            System.out.println("Transferencia no realizada.");
        }
    }
}
