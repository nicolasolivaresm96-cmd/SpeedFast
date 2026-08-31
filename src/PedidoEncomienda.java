public class PedidoEncomienda extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (20 + (1.5 * getDistanciaKm()));
    }
    @Override
    public void asignarRepartidor() {
        setRepartidor("Daniela Tapia");
        System.out.println("Repartidor asignado automáticamente: Daniela Tapia");
    }
    @Override
    public void despachar() {
        System.out.println("Pedido de encomienda despachado correctamente.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido de encomienda cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial del pedido de encomienda #" + getIdPedido());
    }
}