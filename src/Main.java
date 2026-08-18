public class Main {

    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(
                101,
                "Los Laureles 150",
                "Comida"
        );

        Pedido pedidoEncomienda = new PedidoEncomienda(
                102,
                "Av. Urmeneta 350",
                "Encomienda"
        );

        Pedido pedidoExpress = new PedidoExpress(
                103,
                "Palmira Romano 200",
                "Express"
        );

        System.out.println("===== PRUEBA DE SOBRESCRITURA =====");
        System.out.println();

        pedidoComida.asignarRepartidor();
        System.out.println();

        pedidoEncomienda.asignarRepartidor();
        System.out.println();

        pedidoExpress.asignarRepartidor();

        System.out.println();
        System.out.println("===== PRUEBA DE SOBRECARGA =====");
        System.out.println();

        pedidoComida.asignarRepartidor("Juan Pérez");
        System.out.println();

        pedidoEncomienda.asignarRepartidor("Camila Soto");
        System.out.println();

        pedidoExpress.asignarRepartidor("Luis Díaz");
    }
}