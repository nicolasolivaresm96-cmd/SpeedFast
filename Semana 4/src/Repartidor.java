import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidosAsignados;

    public Repartidor(String nombre, List<Pedido> pedidosAsignados) {
        this.nombre = nombre;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        for (Pedido pedido : pedidosAsignados) {
            try {
                System.out.println("[Repartidor: " + nombre + "] Entregando "
                        + pedido.getClass().getSimpleName()
                        + " #" + pedido.getIdPedido() + "...");

                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3001));

                System.out.println("[Repartidor: " + nombre + "] Pedido #"
                        + pedido.getIdPedido() + " entregado.");

            } catch (InterruptedException e) {
                System.out.println("[Repartidor: " + nombre + "] Entrega interrumpida.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("[Repartidor: " + nombre + "] Terminó todas sus entregas.");
    }
}