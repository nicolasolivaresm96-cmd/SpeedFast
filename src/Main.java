public class Main {

    public static void main(String[] args) {

        PedidoComida comida = new PedidoComida(
                1,
                "Av. Italia 456",
                4
        );

        PedidoEncomienda encomienda = new PedidoEncomienda(
                2,
                "Av. Independencia 123",
                6
        );

        PedidoExpress express = new PedidoExpress(
                3,
                "Av. Apoquindo 1500",
                7
        );

        comida.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + comida.calcularTiempoEntrega() + " minutos");
        System.out.println();

        encomienda.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + encomienda.calcularTiempoEntrega() + " minutos");
        System.out.println();

        express.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + express.calcularTiempoEntrega() + " minutos");
    }
}