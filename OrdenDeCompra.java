public class OrdenDeCompra {
    // Atributos
    private Date fechaPedido;
    private int idMaterial;
    private float monto;
    private int cantidad;
    private String estadoPedido;

    // Constructor
    public OrdenDeCompra(Date fechaPedido, int idMaterial, float monto, int cantidad, String estadoPedido) {
        this.fechaPedido = fechaPedido;
        this.idMaterial = idMaterial;
        this.monto = monto;
        this.cantidad = cantidad;
        this.estadoPedido = estadoPedido;
    }

    // Getters y Setters
    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    public void mostrarInformacion() {
        System.out.println("Fecha de pedido: " + fechaPedido);
        System.out.println("ID de material: " + idMaterial);
        System.out.println("Monto: " + monto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Estado del pedido: " + estadoPedido);
    }
}