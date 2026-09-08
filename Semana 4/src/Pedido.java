public abstract class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;
    private String repartidor;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    public abstract int calcularTiempoEntrega();

    public abstract void asignarRepartidor();

    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
        System.out.println("Repartidor asignado manualmente: " + nombre);
    }

    public String getRepartidor() {
        return repartidor;
    }

    protected void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }
}