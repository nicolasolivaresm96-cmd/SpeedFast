import java.util.ArrayList;
import java.util.List;

public class ZonaDeCarga {

    // Recurso compartido entre todos los repartidores.
    private final List<Pedido> pedidos;

    public ZonaDeCarga() {
        pedidos = new ArrayList<>();
        System.out.println("[Zona de carga inicializada]");
    }

    // synchronized evita que varios hilos modifiquen la lista simultáneamente.
    public synchronized void agregarPedido(Pedido p) {
        pedidos.add(p);

        System.out.println(
                "Pedido #" + p.getId()
                        + " agregado. Destino: "
                        + p.getDireccionEntrega()
        );
    }

    // Solo un repartidor puede retirar un pedido a la vez.
    public synchronized Pedido retirarPedido() {
        if (pedidos.isEmpty()) {
            return null;
        }

        return pedidos.remove(0);
    }
}