public class PedidoComida extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int) (2 * getDistanciaKm());
    }
    @Override
    public void asignarRepartidor() {
        setRepartidor("Luis Díaz");
        System.out.println("Repartidor asignado automáticamente: Luis Díaz");
    }
    @Override
    public void despachar() {
        System.out.println("Pedido de comida despachado correctamente.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido de comida cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial del pedido de comida #" + getIdPedido());
    }
}