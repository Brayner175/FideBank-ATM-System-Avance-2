import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente c) {
        clientes.add(c);
    }

    public Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getNombre().equals(id)) {
                return c;
            }
        }
        return null;
    }
}
