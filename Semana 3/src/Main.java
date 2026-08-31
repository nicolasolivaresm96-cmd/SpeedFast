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

        System.out.println("=== PEDIDO COMIDA ===");
        comida.mostrarResumen();
        comida.asignarRepartidor();
        System.out.println("Tiempo estimado: "
                + comida.calcularTiempoEntrega() + " minutos");
        comida.despachar();
        comida.verHistorial();

        System.out.println();

        System.out.println("=== PEDIDO ENCOMIENDA ===");
        encomienda.mostrarResumen();
        encomienda.asignarRepartidor("Daniela Tapia");
        System.out.println("Tiempo estimado: "
                + encomienda.calcularTiempoEntrega() + " minutos");
        encomienda.despachar();
        encomienda.verHistorial();

        System.out.println();

        System.out.println("=== PEDIDO EXPRESS ===");
        express.mostrarResumen();
        express.asignarRepartidor();
        System.out.println("Tiempo estimado: "
                + express.calcularTiempoEntrega() + " minutos");
        express.cancelar();
        express.verHistorial();
    }
}