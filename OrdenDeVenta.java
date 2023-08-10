public class OrdenDeVenta {
    // Atributos
    private Date fechaEmision;
    private int numeroCompra;
    private String tipo;
    private float monto;
    private int cantidad;

    // Constructor
    public OrdenDeVenta(Date fechaEmision, int numeroCompra, String tipo, float monto, int cantidad) {
        this.fechaEmision = fechaEmision;
        this.numeroCompra = numeroCompra;
        this.tipo = tipo;
        this.monto = monto;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public void mostrarInformacion() {
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Número de compra: " + numeroCompra);
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: " + monto);
        System.out.println("Cantidad: " + cantidad);
    }
}