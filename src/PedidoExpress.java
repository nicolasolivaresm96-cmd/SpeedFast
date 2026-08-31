public class PedidoExpress extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        if (getDistanciaKm() > 5) {
            return 15;
        }

        return 10;
    }
    @Override
    public void asignarRepartidor() {
        setRepartidor("Carlos Soto");
        System.out.println("Repartidor asignado automáticamente: Carlos Soto");
    }
    @Override
    public void despachar() {
        System.out.println("Pedido express despachado correctamente.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido express cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial del pedido express #" + getIdPedido());
    }
}