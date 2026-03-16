import java.util.ArrayList;

public class Cliente {

    private String idCliente;
    private String nombre;
    private String pin;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String idCliente, String nombre, String pin) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pin = pin;
        this.cuentas = new ArrayList<>();
    }

    public boolean autenticarPIN(String pinIngresado) {
        return this.pin.equals(pinIngresado);
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public String getNombre() {
        return nombre;
    }
}

