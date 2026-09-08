import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        // Pedidos de Camila
        List<Pedido> pedidosCamila = Arrays.asList(
                new PedidoComida(101, "Av. Italia 456", 4.0),
                new PedidoExpress(102, "Los Carrera 890", 2.5)
        );

        // Pedidos de Luis
        List<Pedido> pedidosLuis = Arrays.asList(
                new PedidoEncomienda(103, "1 Norte 1200", 6.2),
                new PedidoComida(104, "Libertad 340", 3.1)
        );

        // Pedidos de Sofia
        List<Pedido> pedidosSofia = Arrays.asList(
                new PedidoExpress(105, "Arlegui 700", 1.8),
                new PedidoEncomienda(106, "Alvarez 1550", 5.4)
        );

        Repartidor camila = new Repartidor("Camila", pedidosCamila);
        Repartidor luis = new Repartidor("Luis", pedidosLuis);
        Repartidor sofia = new Repartidor("Sofia", pedidosSofia);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("=== SPEEDFAST - ENTREGAS EN PARALELO ===");

        executor.execute(camila);
        executor.execute(luis);
        executor.execute(sofia);

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            System.out.println("La ejecución fue interrumpida.");
            Thread.currentThread().interrupt();
        }

        System.out.println("=== TODAS LAS ENTREGAS FINALIZARON ===");
    }
}