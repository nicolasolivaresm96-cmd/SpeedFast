public class Main {

    public static void main(String[] args) {

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        zonaDeCarga.agregarPedido(new Pedido(1, "Santiago Centro"));
        zonaDeCarga.agregarPedido(new Pedido(2, "Providencia"));
        zonaDeCarga.agregarPedido(new Pedido(3, "Ñuñoa"));
        zonaDeCarga.agregarPedido(new Pedido(4, "Recoleta"));
        zonaDeCarga.agregarPedido(new Pedido(5, "Las Condes"));

        Thread repartidor1 = new Thread(
                new Repartidor("Camila", zonaDeCarga)
        );

        Thread repartidor2 = new Thread(
                new Repartidor("Luis", zonaDeCarga)
        );

        Thread repartidor3 = new Thread(
                new Repartidor("Sofia", zonaDeCarga)
        );

        repartidor1.start();
        repartidor2.start();
        repartidor3.start();

        try {
            repartidor1.join();
            repartidor2.join();
            repartidor3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("El proceso principal fue interrumpido.");
        }

        System.out.println(
                "Todos los pedidos han sido entregados correctamente"
        );
    }
}