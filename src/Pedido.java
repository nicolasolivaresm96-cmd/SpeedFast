public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }
    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void asignarRepartidor() {
        System.out.println("Asignando repartidor...");
    }
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a: " + nombreRepartidor);
    }
}
