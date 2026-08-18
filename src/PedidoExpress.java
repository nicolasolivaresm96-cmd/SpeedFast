public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor más cercano con disponibilidad inmediata encontrado.");
    }
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("[Pedido Express]");
        System.out.println("Verificando disponibilidad inmediata de " + nombreRepartidor + "... OK");
        System.out.println("Pedido Express asignado a " + nombreRepartidor);
    }
}