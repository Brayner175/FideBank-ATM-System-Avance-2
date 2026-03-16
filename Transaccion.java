import java.time.LocalDateTime;

public class Transaccion {

    private String tipo;
    private double monto;
    private String nombreCliente;
    private String numeroCuenta;
    private double saldoRestante;
    private LocalDateTime fecha;

    public Transaccion(String tipo, double monto, String nombreCliente,
                       String numeroCuenta, double saldoRestante) {
        this.tipo = tipo;
        this.monto = monto;
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldoRestante = saldoRestante;
        this.fecha = LocalDateTime.now();
    }

    public void imprimirComprobante() {
        System.out.println("\n===== FIDEBANK ATM =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Transaccion: " + tipo);
        System.out.println("Monto: CRC " + monto);
        System.out.println("Saldo disponible: CRC " + saldoRestante);
        System.out.println("Fecha: " + fecha);
        System.out.println("=========================\n");
    }
}
