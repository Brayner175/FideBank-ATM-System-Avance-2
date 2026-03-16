public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("1", "Brayner Cordero", "2004175");
        Cuenta cuenta1 = new Cuenta("175", cliente);

        cliente.agregarCuenta(cuenta1);

        CajeroAutomatico atm = new CajeroAutomatico();

        atm.depositar(cuenta1, 50000);
        atm.retirar(cuenta1, 10000);

        System.out.println("Saldo actual: " + cuenta1.consultarSaldo());
    }
}
